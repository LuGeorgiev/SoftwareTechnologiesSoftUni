using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using Blog.Data;
using Blog.Models;
using Microsoft.AspNetCore.Authorization;

namespace Blog.Controllers
{
    public class ArticlesController : Controller
    {
        public ActionResult Index()
        {
            return RedirectToAction("List");
        }

        public ActionResult List()
        {
            var articles = _context.Articles
                .Include(x => x.Author)
                .ToList();

            return View(articles);
        }
        private readonly ApplicationDbContext _context;

        public ArticlesController(ApplicationDbContext context)
        {
            _context = context;
        }

        // GET: Articles
        //public async Task<IActionResult> Index()
        //{
        //    var applicationDbContext = _context.Articles.Include(a => a.Author);
        //    return View(await applicationDbContext.ToListAsync());
        //}

        // GET: Articles/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return StatusCode(500);
            }

            var article = await _context.Articles
                .Include(a => a.Author)
                .SingleOrDefaultAsync(m => m.Id == id);
            if (article == null)
            {
                return StatusCode(500);
            }

            return View(article);
        }

        // GET: Articles/Create
        [Authorize]
        public IActionResult Create()
        {
            
            return View();
        }

        // POST: Articles/Create
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]  
        [Authorize]
        public async Task<IActionResult> Create(Article article)
        {
            if (ModelState.IsValid)
            {
                var authorId = _context.Users
                    .Where(x => x.UserName == this.User.Identity.Name)
                    .First()
                    .Id;
                article.AuthorId = authorId;
                _context.Articles.Add(article);
               
                _context.SaveChanges();

                return RedirectToAction("Index");
            }
            
            return View(article);
        }

        // GET: Articles/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = await _context.Articles.SingleOrDefaultAsync(m => m.Id == id);
            if (article == null)
            {
                return NotFound();
            }
            ViewData["AuthorId"] = new SelectList(_context.Users, "Id", "Id", article.AuthorId);
            return View(article);
        }

        // POST: Articles/Edit/5
        // To protect from overposting attacks, please enable the specific properties you want to bind to, for 
        // more details see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        
        public ActionResult Edit(ArticleViewModel model)
        {
            var article = _context.Articles
                .FirstOrDefault(x => x.Id == model.Id);

            article.Title = model.Title;
            article.Content = model.Content;

            _context.Update(article);
            _context.SaveChanges();
            
            return RedirectToAction("Index");
        }

        // GET: Articles/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = _context.Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (IsUserAuthorizedToEdit(article)==false)
            {
                return Forbid();
            }
            if (article == null)
            {
                return StatusCode(404);
            }

            return View(article);
        }

        // POST: Articles/Delete/5
        [HttpPost, ActionName("Delete")]        
        public ActionResult DeleteConfirmed(int id)
        {
            var article = _context.Articles
                .Include(m => m.Author)
                .First(x=>x.Id==id);
            if (article==null)
            {
                return NotFound();
            }
            _context.Articles.Remove(article);
            _context.SaveChanges();

            return RedirectToAction("Index");
        }

        private bool ArticleExists(int id)
        {
            return _context.Articles.Any(e => e.Id == id);
        }

        private bool IsUserAuthorizedToEdit(Article article)
        {
            bool isAdmin = this.User.IsInRole("Admin");
            bool isAuthor = article.IsAuthor(this.User.Identity.Name);

            return isAdmin || isAuthor;
        }
    }
}
