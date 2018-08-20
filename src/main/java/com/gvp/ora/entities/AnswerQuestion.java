package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="answer")
public class AnswerQuestion {

	@Id
	@Column(name="id_answer")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_question")
	private Question question;
	
	@Column(name="statement")
	private String statement;
	
	@Column(name="validity")
	private Boolean validity;

	public AnswerQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnswerQuestion(Integer id, Question question, String statement, Boolean validity) {
		super();
		this.id = id;
		this.question = question;
		this.statement = statement;
		this.validity = validity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonIgnore
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswer() {
		return statement;
	}

	public void setAnswer(String statement) {
		this.statement = statement;
	}

	public Boolean getValidity() {
		return validity;
	}

	public void setValidity(Boolean validity) {
		this.validity = validity;
	}

	
	
	
	
	
	
}
