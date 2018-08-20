package com.gvp.ora.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "question") // nom de la table sur PostgreSQL
public class Question {

	@Id
	@Column(name = "id_question")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "id_corrector")
	private Integer id_corr_question;

	@Column(name = "id_redactor")
	private Integer id_redac_question;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_questiontype")
	private TypeQuestion typeQuestion;

	@Column(name = "statement")
	private String enonce_question;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_gcmcategory")
	private GcmCategory gcmCategorie;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_gcmlevel")
	private GcmLevel gcmLevel;
	
	/**
	 * durée en secondes
	 */
	@Column(name = "duration")
	private Integer duration_question;

	@Column(name = "creation_date")
	private Date creationdate;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_programminglanguage")
	private LanguageQuestion languageQuestion;

	@Column(name = "id_language")
	private Integer id_language;

	@OneToMany(mappedBy = "question")
	private List<AnswerQuestion> answers;

	@Column(name="id_quizdefault")
	private Integer id_quizdefault;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Integer id, Integer id_corr_question, Integer id_redac_question, TypeQuestion typeQuestion,
			String enonce_question, GcmCategory gcmCategorie, GcmLevel gcmLevel, Integer duration_question,
			Date creationdate, LanguageQuestion languageQuestion, Integer id_language, List<AnswerQuestion> answers,
			Integer id_quizdefault) {
		super();
		this.id = id;
		this.id_corr_question = id_corr_question;
		this.id_redac_question = id_redac_question;
		this.typeQuestion = typeQuestion;
		this.enonce_question = enonce_question;
		this.gcmCategorie = gcmCategorie;
		this.gcmLevel = gcmLevel;
		this.duration_question = duration_question;
		this.creationdate = creationdate;
		this.languageQuestion = languageQuestion;
		this.id_language = id_language;
		this.answers = answers;
		this.id_quizdefault = id_quizdefault;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_corr_question() {
		return id_corr_question;
	}

	public void setId_corr_question(Integer id_corr_question) {
		this.id_corr_question = id_corr_question;
	}

	public Integer getId_redac_question() {
		return id_redac_question;
	}

	public void setId_redac_question(Integer id_redac_question) {
		this.id_redac_question = id_redac_question;
	}

	public TypeQuestion getTypeQuestion() {
		return typeQuestion;
	}

	public void setTypeQuestion(TypeQuestion typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

	public String getEnonce_question() {
		return enonce_question;
	}

	public void setEnonce_question(String enonce_question) {
		this.enonce_question = enonce_question;
	}

	public GcmCategory getGcmCategorie() {
		return gcmCategorie;
	}

	public void setGcmCategorie(GcmCategory gcmCategorie) {
		this.gcmCategorie = gcmCategorie;
	}

	public GcmLevel getGcmLevel() {
		return gcmLevel;
	}

	public void setGcmLevel(GcmLevel gcmLevel) {
		this.gcmLevel = gcmLevel;
	}

	public Integer getDuration_question() {
		return duration_question;
	}

	public void setDuration_question(Integer duration_question) {
		this.duration_question = duration_question;
	}

	public Date getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	public LanguageQuestion getLanguageQuestion() {
		return languageQuestion;
	}

	public void setLanguageQuestion(LanguageQuestion languageQuestion) {
		this.languageQuestion = languageQuestion;
	}

	public Integer getId_language() {
		return id_language;
	}

	public void setId_language(Integer id_language) {
		this.id_language = id_language;
	}

	public List<AnswerQuestion> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerQuestion> answers) {
		this.answers = answers;
	}

	public Integer getId_quizdefault() {
		return id_quizdefault;
	}

	public void setId_quizdefault(Integer id_quizdefault) {
		this.id_quizdefault = id_quizdefault;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", id_corr_question=" + id_corr_question + ", id_redac_question="
				+ id_redac_question + ", typeQuestion=" + typeQuestion + ", enonce_question=" + enonce_question
				+ ", gcmCategorie=" + gcmCategorie + ", gcmLevel=" + gcmLevel + ", duration_question="
				+ duration_question + ", creationdate=" + creationdate + ", languageQuestion=" + languageQuestion
				+ ", id_language=" + id_language + ", answers=" + answers + ", id_quizdefault=" + id_quizdefault + "]";
	}
	
	
	
	


	

	

	

}
