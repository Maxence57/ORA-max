package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.TypeQuestion;

@Repository
public interface QuizProgressRepo extends JpaRepository<QuizProgress, Integer> {

	QuizProgress findByName(String name);

	
}
