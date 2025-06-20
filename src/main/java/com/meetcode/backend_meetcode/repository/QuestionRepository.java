package com.meetcode.backend_meetcode.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meetcode.backend_meetcode.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, UUID> {
    Optional<Question> findByTitleSlug(String titleSlug);
} 