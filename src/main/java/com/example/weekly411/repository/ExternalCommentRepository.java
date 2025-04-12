package com.example.weekly411.repository;

import com.example.weekly411.domain.ExternalComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalCommentRepository extends JpaRepository<ExternalComment, Long> {
}
