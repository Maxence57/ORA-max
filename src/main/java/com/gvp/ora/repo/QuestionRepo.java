package com.gvp.ora.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{
	
	List<Question> findByQuestionType(String questiontype);

	//List<Question> findByTypeQuestionType(String typequestion);
	//List<Question> findById_language_question(Integer id_langue);
	
}
