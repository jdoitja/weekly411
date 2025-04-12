package com.example.weekly411.repository;

import com.example.weekly411.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArticleId(Long articleId); // article.id 를 자동으로 매핑
}