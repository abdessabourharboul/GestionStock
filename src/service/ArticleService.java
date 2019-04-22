/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Article;
import dao.AbstractDao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class ArticleService extends AbstractDao<Article> {

    public ArticleService() {
        super(Article.class);
    }

    public List<Article> findStockBas() throws Exception {
        List<Article> tousArticles = findAll();
        List<Article> res = new ArrayList<>();
        for (Article article : tousArticles) {
            if (article.getQuantite() < 5) {
                res.add(article);
            }
        }
        return res;
    }

    public List<Article> findByCriteria(String article, String fournisseur) {
        String requeta = "select * from article where 1=1";
        if (article != null) {
            requeta += " and id = '" + article + "'";
        }
        if (fournisseur != null) {
            requeta += " and fournisseur = '" + fournisseur + "'";
        }
        try {
            return load(requeta);
        } catch (Exception ex) {
            Logger.getLogger(ArticleService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ArrayList<>();
    }

}
