package com.example.weekly411.controller;

import com.example.weekly411.dto.CommentDTO;
import com.example.weekly411.service.ArticleService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/api/articles")
    public List<CommentDTO> showComments() {
        List<CommentDTO> commentDTOs = articleService.getAllCommentsWithArticle();
        return commentDTOs;
    }
}