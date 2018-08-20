package com.gvp.ora.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.ora.controller.service.LangProgService;
import com.gvp.ora.controller.service.QuestionService;
import com.gvp.ora.entities.LangProg;
import com.gvp.ora.repo.LangProgRepo;

@Service
public class GenderImpl implements GenderService {

	@Autowired
	private GenderRepo genderRepo;
	
	@Override
	public List<Gender> getAllGender() {
		
		return genderRepo.findAll();
	}
	

}
