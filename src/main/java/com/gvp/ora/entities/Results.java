package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "results") // doit correspondre au nom de la table dans Postgres
public class Results {


	@Column(name = "id_question")
	private Integer id_question;
	@Column(name = "id_quiz")
	private Integer id_quiz;
	@Column(name = "id_answer")
	private Integer id_answer;
	@Column(name = "closed_answer_candidate")
	private Boolean closed_answer_candidate;
	@Column(name = "point_question")
	private Boolean point_question;
	@Column(name = "open_answer_candidate")
	private String open_answer_candidate;
	@Column(name = "correction_open_question")
	private Boolean correction_open_question;
	@Column(name = "point_open_question")
	private Integer point_open_question;
	
	
	
	
	public Results(Integer id_question, Integer id_quiz, Integer id_answer, Boolean closed_answer_candidate, 
			Boolean point_closed_question, String answer_open_candidate, Boolean correction_open_question, Integer point_open_question) {
		super();
		this.id_question = id_question;
		this.id_quiz = id_quiz;
		this.id_answer = id_answer;
		this.closed_answer_candidate = closed_answer_candidate;
		this.point_closed_question = point_closed_question;
		this.open_answer_candidate = open_answer_candidate;
		this.correction_open_question = correction_open_question;
		this.point_open_question = point_open_candidate;
	}
	
	
	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId_question() {
		return id_question;
	}
	public void setId_question(Integer id_question) {
		this.id_question = id_question;
	}
	public Integer getId_quiz() {
		return id_quiz;
	}
	public void setId_quiz(Integer id_quiz) {
		this.id_quiz = id_quiz;
	}
	public Integer getId_answer() {
		return id_answer;
	}
	public void setId_answer(Integer id_answer) {
		this.id_answer = id_answer;
	}
	public Boolean getClosed_answer_candidate() {
		return closed_answer_candidate;
	}
	public void setClosed_answer_candidate(Boolean closed_answer_candidate) {
		this.closed_answer_candidate = closed_answer_candidate;
	}
	public Boolean getPoint_closed_question() {
		return point_closed_question;
	}
	public void setPoint_closed_question(Boolean point_closed_question) {
		this.point_closed_question = point_closed_question;
	}
	public String getOpen_answer_candidate() {
		return open_answer_candidate;
	}
	public void setOpen_answer_candidate(String open_answer_candidate) {
		this.open_answer_candidate = open_answer_candidate;
	}
	public Boolean getCorrection_open_question() {
		return correction_open_question;
	}
	public void setCorrection_open_question(Boolean correction_open_question) {
		this.correction_open_question = correction_open_question;
	}
	public Integer getPoint_open_question() {
		return point_open_question;
	}
	public void setPoint_open_question(Integer point_open_question) {
		this.point_open_question = point_open_question;
	}
	

}
