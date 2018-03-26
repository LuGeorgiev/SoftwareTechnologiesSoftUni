module.exports = {
    index: (req, res) => {
        Article.findAll({
            limit: 6,
            include: [{
                model: User
            }]
        }).then(artticle => {
            res.render('home/index', { articles: articles });
        });
    }
};