package com.example.weekly411.dto;

import com.example.weekly411.domain.Article;
import com.example.weekly411.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private Long commentId;
    private Long articleId;
    private String body;
    private LocalDateTime createdAt;
    private ArticleDTO article;  // ArticleDTO 포함

    public CommentDTO(Comment comment) {
        this.commentId = comment.getId();
        this.articleId = comment.getArticle().getId();
        this.body = comment.getBody();
        this.createdAt = comment.getCreatedAt();
        this.article = new ArticleDTO(comment.getArticle());
    }
}
