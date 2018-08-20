package com.gvp.ora.controller.service;

import java.util.List;

import com.gvp.ora.entities.GcmCategory;
import com.gvp.ora.entities.LangProg;
import com.gvp.ora.entities.Question;
import com.gvp.ora.entities.TypeQuestion;
import com.gvp.ora.utils.Filter;

public interface QuestionService {
	
//	public List<Question> getAllQuestions();
//	
//	public List<Question> getAllQuestionsByLanguage();
	
	public List<Question> getAllQuestions();
	
	public List<Question> getQuestionsFiltered(Filter filter);

	public List<GcmCategory> getAllCatGcm();

	public List<TypeQuestion> getAllTypeQuestion();


}
