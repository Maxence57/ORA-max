package com.gvp.ora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.ora.controller.service.LangProgService;
import com.gvp.ora.controller.service.QuestionService;
import com.gvp.ora.entities.AnswerQuestion;
import com.gvp.ora.entities.GcmCategory;
import com.gvp.ora.entities.LangProg;
import com.gvp.ora.entities.Proposition;
import com.gvp.ora.entities.Question;
import com.gvp.ora.entities.TypeQuestion;
import com.gvp.ora.repo.AnswerRepo;
import com.gvp.ora.repo.PropositionRepo;
import com.gvp.ora.utils.Filter;

@RestController
public class QuestionController {
	
	@Autowired
	private PropositionRepo propositionRepo;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private LangProgService langProgService;

	@Autowired
	private AnswerRepo answerRepo;

	@RequestMapping(value = "/api/questions/findAll")
	public List<Question> getAllQuestions() { // public ou private ??
		return questionService.getAllQuestions();
	}

	@RequestMapping(value = "/api/questions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Question> getQuestionsByFilter(@RequestBody Filter filter) {
		return questionService.getQuestionsFiltered(filter);
	}

	@RequestMapping(value = "api/answer/findAll")
	public List<AnswerQuestion> getAllAnswer() {
		return answerRepo.findAll();
	}

	@RequestMapping(value = "api/langProg/findAll")
	public List<LangProg> getAllLangProg() {
		return langProgService.getAllLangProg();
	}
	
	@RequestMapping(value = "api/catGcm/findAll")
	public List<GcmCategory> getAllCatGcm() {
		return questionService.getAllCatGcm();
	}
	
	@RequestMapping(value = "api/typeQuestion/findAll")
	public List<TypeQuestion> getAllTypeQuestion() {
		return questionService.getAllTypeQuestion();
	}

	
	
	
	
	

	// @RequestMapping(value = "test")
	// public ArrayList getArray(@RequestBody String array) {
	// Gson googleJson = new Gson();
	// ArrayList javaArrayListFromGSON = googleJson.fromJson(array
	// ,ArrayList.class);
	//
	// System.out.println(javaArrayListFromGSON);
	// System.out.println(javaArrayListFromGSON.get(0));
	//
	// return javaArrayListFromGSON;
	// }

	// @RequestMapping(value="json/test")
	// public ArrayList ohla() {
	// String jsonArrayString = "[\"Russian\",\"English\",\"French\"]";
	// Gson googleJson = new Gson();
	// ArrayList javaArrayListFromGSON = googleJson.fromJson(jsonArrayString
	// ,ArrayList.class);
	//
	// System.out.println(javaArrayListFromGSON);
	// return javaArrayListFromGSON;
	// }

}
