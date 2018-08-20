package com.gvp.ora.entities;

import java.sql.Date;
import java.util.List;
import java.util.Set;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="questionproposition")
public class Proposition {
	
	@Id
	@Column(name="id_questionproposition")
	@SequenceGenerator(name="proposition_sequence",sequenceName="seq_question_proposition", initialValue=0, allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="proposition_sequence")
	private Integer id;
	
	@Column(name = "id_redactor")
	private Integer id_redac;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_questiontype") // on map vers question type, pas besoin de créer propositionType , c'est la meme table
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
	
	@OneToMany(mappedBy = "questionproposition")
	public Set<AnswerProposition> answerproposition;

	public Proposition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proposition(Integer id, Integer id_redac, TypeQuestion typeQuestion, String enonce_question,
			GcmCategory gcmCategorie, GcmLevel gcmLevel, Integer duration_question, Date creationdate,
			LanguageQuestion languageQuestion, Integer id_language, Set<AnswerProposition> answerproposition) {
		super();
		this.id = id;
		this.id_redac = id_redac;
		this.typeQuestion = typeQuestion;
		this.enonce_question = enonce_question;
		this.gcmCategorie = gcmCategorie;
		this.gcmLevel = gcmLevel;
		this.duration_question = duration_question;
		this.creationdate = creationdate;
		this.languageQuestion = languageQuestion;
		this.id_language = id_language;
		this.answerproposition = answerproposition;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_redac() {
		return id_redac;
	}

	public void setId_redac(Integer id_redac) {
		this.id_redac = id_redac;
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

	public Set<AnswerProposition> getAnswerproposition() {
		return answerproposition;
	}

	public void setAnswerproposition(Set<AnswerProposition> answerproposition) {
		this.answerproposition = answerproposition;
	}

	@Override
	public String toString() {
		return "Proposition [id=" + id + ", id_redac=" + id_redac + ", typeQuestion=" + typeQuestion
				+ ", enonce_question=" + enonce_question + ", gcmCategorie=" + gcmCategorie + ", gcmLevel=" + gcmLevel
				+ ", duration_question=" + duration_question + ", creationdate=" + creationdate + ", languageQuestion="
				+ languageQuestion + ", id_language=" + id_language + ", answerproposition=" + answerproposition + "]";
	}	
	
	
	
	
	
	
	
	
	
	
	



}
