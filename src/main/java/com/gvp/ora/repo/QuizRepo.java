package com.gvp.ora.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Integer> {

	public List<Quiz> findById_candidate(String id_candidate);
	
	public List<Quiz> findByidId_users(Integer id_users);
	
}
