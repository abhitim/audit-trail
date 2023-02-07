package com.example.audit.article;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

  @Autowired
  ArticleRepository articleRepository;

  @PostMapping("/articles")
  Article save(@RequestBody ArticleDTO articleDto){
    Article article = new Article();
    article.setContent(articleDto.getContent());
//    String creator=SecurityContextHolder.getContext().getAuthentication().getName();
//    article.setCreatedBy(creator);
//    article.setCreatedAt(LocalDateTime.now());
    return articleRepository.save(article);
  }

  @GetMapping("/articles")
  List<Article> getArticles(){
    return articleRepository.findAll();
  }

  @PutMapping("/articles/{id}")
  Article update(@PathVariable long id, @RequestBody ArticleDTO articleDto){
	 
    Article inDB = articleRepository.getOne(id);
    inDB.setContent(articleDto.getContent());
    return articleRepository.save(inDB);
  }
  
}
