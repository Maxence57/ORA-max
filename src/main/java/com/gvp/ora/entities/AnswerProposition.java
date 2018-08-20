package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="answerproposition")
public class AnswerProposition {
	
	@Id
	@Column(name="id_answerproposition")
	@SequenceGenerator(name="answerproposition_seq",sequenceName="seq_answer_proposition", initialValue=0, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="answerproposition_seq")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_questionproposition")
	private Proposition questionproposition; // attention bien noter !
	
	@Column(name="statement")
	private String statement;
	
	@Column(name="validity")
	private Boolean validity;

	public AnswerProposition(Integer id, Proposition questionproposition, String statement, Boolean validity) {
		super();
		this.id = id;
		this.questionproposition = questionproposition;
		this.statement = statement;
		this.validity = validity;
	}

	public AnswerProposition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@JsonIgnore
	public Proposition getQuestionproposition() {
		return questionproposition;
	}

	public void setQuestionproposition(Proposition questionproposition) {
		this.questionproposition = questionproposition;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public Boolean getValidity() {
		return validity;
	}

	public void setValidity(Boolean validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "AnswerProposition [id=" + id + ", questionproposition=" + questionproposition + ", statement="
				+ statement + ", validity=" + validity + "]";
	}
	
	
	

	
	

	
	

	
	
	

	
	
	

}
