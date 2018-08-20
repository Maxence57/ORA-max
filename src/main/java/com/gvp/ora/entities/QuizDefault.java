package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quizdefault")
public class QuizDefault {
	
	@Id
	@Column(name="id_quizdefault")
	private Integer id;
	
	@Column(name="name")
	private String name;

	public Gender(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public QuizDefault() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
