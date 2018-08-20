package com.gvp.ora.utils;

import java.util.ArrayList;

import com.google.gson.Gson;

public class Filter {

	private ArrayList<String> typeQuestion;
	private ArrayList<String> categorieGcm;
	private String niveau;
	private ArrayList<String> programmingLanguage;

	public Filter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Filter(ArrayList<String> typeQuestion, ArrayList<String> categorieGcm, String niveau,
			ArrayList<String> programmingLanguage) {
		super();
		this.typeQuestion = typeQuestion;
		this.categorieGcm = categorieGcm;
		this.niveau = niveau;
		this.programmingLanguage = programmingLanguage;
	}

	public ArrayList<String> getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(ArrayList<String> typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public ArrayList<String> getCategorieGcm() {
		return categorieGcm;
	}

	public void setCategorieGcm(ArrayList<String> categorieGcm) {
		this.categorieGcm = categorieGcm;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public ArrayList<String> getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(ArrayList<String> programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	

	
	
}
