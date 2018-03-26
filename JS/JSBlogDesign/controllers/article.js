const Article = require('../models').Article;

module.exports = {
    createGet: (req, res) => {
        res.render('article/create');
    },
    createPost: (req, res) => {
        let articleArgs = req.body;
        //take values
        const content = req.body.content;
        const title = req.body.title;
        let errorMsg = '';

        if (!req.isAuthenticated()) {
            errorMsg = 'Log before creating articles';
        } else if (!articleArgs.content) {
            errorMsg = 'content cannot be empty';
        } else if (!articleArgs.title) {
            errorMsg = 'title cannot be empty';
        }

        if (errorMsg) {
            res.render('article/create', { error: errorMsg });
            return;
        }
        //find author
        articleArgs.authorId = req.user.id;
        //validate input
        //copy them in DB

        Article.create(articleArgs).then(article => {
            res.redirect('/');
        }).catch(err => {
            console.log(err.message);
            res.render('article/create', { error: err.message });

        });

        //redirect after Articles was uplodaded (redirect to /)
    },
    details: (req, res) => {
        let id = req.params.id;
        Article.findById(id, {
            include: [{
                model: User
            }]
        }).then(article => {
            res.render('article/details', article.dataValues)
        });
    }
};