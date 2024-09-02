
package com.example.elasticsearchdemo;

import com.example.elasticsearchdemo.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    public Optional<Article> findArticleById(String id) {
        return articleRepository.findById(id);
    }

    public Iterable<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    public void deleteArticleById(String id) {
        articleRepository.deleteById(id);
    }
}
