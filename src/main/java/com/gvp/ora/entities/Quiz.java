package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quiz")
public class Quiz {
	
	@Id
	@Column(name="id_quiz")
	private Integer id;
	
	@Column(name="id_candidate")
	private Integer id_candidate;
	
	@Column(name="id_users")
	private String id_users;
	
	@Column(name="city")
	private String city;

	@Column(name="country")
	private String country;
	
	@Column(name="salon")
	private String salon;
	
	@Column(name="duration")
	private Integer duration;

	@Column(name="date")
	private String date;
	
	@Column(name="id_quizprogress")
	private String id_quizprogress;
	
	@Column(name="grade")
	private String grade;
	
	@Column(name="id_language")
	private String id_language;
	
	@Column(name="energie_enthousiasme")
	private String energie_enthousiasme;
	
	@Column(name="sens_des_responsabilites")
	private String sens_des_responsabilites;
	
	@Column(name="remarques_dynamique_personnelle")
	private String remarques_dynamique_personnelle;
	
	@Column(name="expression_orale")
	private String expression_orale;
	
	@Column(name="travail_en_equipe")
	private String travail_en_equipe;
	
	@Column(name="respect_des_autres")
	private String respect_des_autres;
	
	@Column(name="remarques_relationnel_communication")
	private String remarques_relationnel_communication;
	
	@Column(name="esprit_d_analyse")
	private String esprit_d_analyse;
	
	@Column(name="esprit_de_synthese")
	private String esprit_de_synthese;
	
	@Column(name="capacite_d_apprentissage")
	private String capacite_d_apprentissage;
	
	@Column(name="remarques_agilite_intellectuelle")
	private String remarques_agilite_intellectuelle;
	
	@Column(name="orientation_satisfaction_clients")
	private String orientation_satisfaction_clients;
	
	@Column(name="reactivite_disponibilite")
	private String reactivite_disponibilite;
	
	@Column(name="force_de_proposition")
	private String force_de_proposition;
	
	@Column(name="remarques_sens_du_service")
	private String remarques_sens_du_service;
	
	@Column(name="gestion_du_stress")
	private String gestion_du_stress;
	
	@Column(name="confiance_en_soi")
	private String confiance_en_soi;
	
	@Column(name="remarques_controle_de_soi")
	private String remarques_controle_de_soi;
	
	@Column(name="autonomie")
	private String autonomie;
	
	@Column(name="rigueur")
	private String rigueur;
	
	@Column(name="gestion_des_priorites")
	private String gestion_des_priorites;
	
	@Column(name="remarques_organisation_methode")
	private String remarques_organisation_methode;
	
	@Column(name="competences_fonctionnelles")
	private String competences_fonctionnelles;
	
	@Column(name="competences_manageriales")
	private String competences_manageriales;
	
	@Column(name="competences_commerciales")
	private String competences_commerciales;
	
	@Column(name="competences_techniques")
	private String competences_techniques;
	
	@Column(name="langue_1")
	private String langue_1;
	
	@Column(name="id_langue_1")
	private Integer id_langue_1;
	
	@Column(name="test_langue_1")
	private String test_langue_1;
	
	@Column(name="langue_2")
	private String langue_2;
	
	@Column(name="id_langue_2")
	private Integer id_langue_2;
	
	@Column(name="test_langue_2")
	private String test_langue_2;
	
	@Column(name="langue_3")
	private String langue_3;
	
	@Column(name="id_langue_3")
	private Integer id_langue_3;
	
	@Column(name="test_langue_3")
	private String test_langue_3;
	
	@Column(name="langue_4")
	private String langue_4;
	
	@Column(name="id_langue_4")
	private Integer id_langue_4;
	
	@Column(name="test_langue_4")
	private String test_langue_4;
	
	@Column(name="points_positifs")
	private String points_positifs;
	
	@Column(name="points_de_vigilance")
	private String points_de_vigilance;
	
	@Column(name="avis_recrutement")
	private String avis_recrutement;
	
	@Column(name="commentaires")
	private String commentaires;

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(Integer id, Integer id_candidate, String id_users, String city, String country, String salon,
			Integer duration, String date, String id_quizprogress, String grade, String id_language,
			String energie_enthousiasme, String sens_des_responsabilites, String remarques_dynamique_personnelle,
			String expression_orale, String travail_en_equipe, String respect_des_autres,
			String remarques_relationnel_communication, String esprit_d_analyse, String esprit_de_synthese,
			String capacite_d_apprentissage, String remarques_agilite_intellectuelle,
			String orientation_satisfaction_clients, String reactivite_disponibilite, String force_de_proposition,
			String remarques_sens_du_service, String gestion_du_stress, String confiance_en_soi,
			String remarques_controle_de_soi, String autonomie, String rigueur, String gestion_des_priorites,
			String remarques_organisation_methode, String competences_fonctionnelles, String competences_manageriales,
			String competences_commerciales, String competences_techniques, String langue_1, Integer id_langue_1,
			String test_langue_1, String langue_2, Integer id_langue_2, String test_langue_2, String langue_3,
			Integer id_langue_3, String test_langue_3, String langue_4, Integer id_langue_4, String test_langue_4,
			String points_positifs, String points_de_vigilance, String avis_recrutement, String commentaires) {
		super();
		this.id = id;
		this.id_candidate = id_candidate;
		this.id_users = id_users;
		this.city = city;
		this.country = country;
		this.salon = salon;
		this.duration = duration;
		this.date = date;
		this.id_quizprogress = id_quizprogress;
		this.grade = grade;
		this.id_language = id_language;
		this.energie_enthousiasme = energie_enthousiasme;
		this.sens_des_responsabilites = sens_des_responsabilites;
		this.remarques_dynamique_personnelle = remarques_dynamique_personnelle;
		this.expression_orale = expression_orale;
		this.travail_en_equipe = travail_en_equipe;
		this.respect_des_autres = respect_des_autres;
		this.remarques_relationnel_communication = remarques_relationnel_communication;
		this.esprit_d_analyse = esprit_d_analyse;
		this.esprit_de_synthese = esprit_de_synthese;
		this.capacite_d_apprentissage = capacite_d_apprentissage;
		this.remarques_agilite_intellectuelle = remarques_agilite_intellectuelle;
		this.orientation_satisfaction_clients = orientation_satisfaction_clients;
		this.reactivite_disponibilite = reactivite_disponibilite;
		this.force_de_proposition = force_de_proposition;
		this.remarques_sens_du_service = remarques_sens_du_service;
		this.gestion_du_stress = gestion_du_stress;
		this.confiance_en_soi = confiance_en_soi;
		this.remarques_controle_de_soi = remarques_controle_de_soi;
		this.autonomie = autonomie;
		this.rigueur = rigueur;
		this.gestion_des_priorites = gestion_des_priorites;
		this.remarques_organisation_methode = remarques_organisation_methode;
		this.competences_fonctionnelles = competences_fonctionnelles;
		this.competences_manageriales = competences_manageriales;
		this.competences_commerciales = competences_commerciales;
		this.competences_techniques = competences_techniques;
		this.langue_1 = langue_1;
		this.id_langue_1 = id_langue_1;
		this.test_langue_1 = test_langue_1;
		this.langue_2 = langue_2;
		this.id_langue_2 = id_langue_2;
		this.test_langue_2 = test_langue_2;
		this.langue_3 = langue_3;
		this.id_langue_3 = id_langue_3;
		this.test_langue_3 = test_langue_3;
		this.langue_4 = langue_4;
		this.id_langue_4 = id_langue_4;
		this.test_langue_4 = test_langue_4;
		this.points_positifs = points_positifs;
		this.points_de_vigilance = points_de_vigilance;
		this.avis_recrutement = avis_recrutement;
		this.commentaires = commentaires;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_candidate() {
		return id_candidate;
	}

	public void setId_candidate(Integer id_candidate) {
		this.id_candidate = id_candidate;
	}

	public String getId_users() {
		return id_users;
	}

	public void setId_users(String id_users) {
		this.id_users = id_users;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getId_quizprogress() {
		return id_quizprogress;
	}

	public void setId_quizprogress(String id_quizprogress) {
		this.id_quizprogress = id_quizprogress;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getId_language() {
		return id_language;
	}

	public void setId_language(String id_language) {
		this.id_language = id_language;
	}

	public String getEnergie_enthousiasme() {
		return energie_enthousiasme;
	}

	public void setEnergie_enthousiasme(String energie_enthousiasme) {
		this.energie_enthousiasme = energie_enthousiasme;
	}

	public String getSens_des_responsabilites() {
		return sens_des_responsabilites;
	}

	public void setSens_des_responsabilites(String sens_des_responsabilites) {
		this.sens_des_responsabilites = sens_des_responsabilites;
	}

	public String getRemarques_dynamique_personnelle() {
		return remarques_dynamique_personnelle;
	}

	public void setRemarques_dynamique_personnelle(String remarques_dynamique_personnelle) {
		this.remarques_dynamique_personnelle = remarques_dynamique_personnelle;
	}

	public String getExpression_orale() {
		return expression_orale;
	}

	public void setExpression_orale(String expression_orale) {
		this.expression_orale = expression_orale;
	}

	public String getTravail_en_equipe() {
		return travail_en_equipe;
	}

	public void setTravail_en_equipe(String travail_en_equipe) {
		this.travail_en_equipe = travail_en_equipe;
	}

	public String getRespect_des_autres() {
		return respect_des_autres;
	}

	public void setRespect_des_autres(String respect_des_autres) {
		this.respect_des_autres = respect_des_autres;
	}

	public String getRemarques_relationnel_communication() {
		return remarques_relationnel_communication;
	}

	public void setRemarques_relationnel_communication(String remarques_relationnel_communication) {
		this.remarques_relationnel_communication = remarques_relationnel_communication;
	}

	public String getEsprit_d_analyse() {
		return esprit_d_analyse;
	}

	public void setEsprit_d_analyse(String esprit_d_analyse) {
		this.esprit_d_analyse = esprit_d_analyse;
	}

	public String getEsprit_de_synthese() {
		return esprit_de_synthese;
	}

	public void setEsprit_de_synthese(String esprit_de_synthese) {
		this.esprit_de_synthese = esprit_de_synthese;
	}

	public String getCapacite_d_apprentissage() {
		return capacite_d_apprentissage;
	}

	public void setCapacite_d_apprentissage(String capacite_d_apprentissage) {
		this.capacite_d_apprentissage = capacite_d_apprentissage;
	}

	public String getRemarques_agilite_intellectuelle() {
		return remarques_agilite_intellectuelle;
	}

	public void setRemarques_agilite_intellectuelle(String remarques_agilite_intellectuelle) {
		this.remarques_agilite_intellectuelle = remarques_agilite_intellectuelle;
	}

	public String getOrientation_satisfaction_clients() {
		return orientation_satisfaction_clients;
	}

	public void setOrientation_satisfaction_clients(String orientation_satisfaction_clients) {
		this.orientation_satisfaction_clients = orientation_satisfaction_clients;
	}

	public String getReactivite_disponibilite() {
		return reactivite_disponibilite;
	}

	public void setReactivite_disponibilite(String reactivite_disponibilite) {
		this.reactivite_disponibilite = reactivite_disponibilite;
	}

	public String getForce_de_proposition() {
		return force_de_proposition;
	}

	public void setForce_de_proposition(String force_de_proposition) {
		this.force_de_proposition = force_de_proposition;
	}

	public String getRemarques_sens_du_service() {
		return remarques_sens_du_service;
	}

	public void setRemarques_sens_du_service(String remarques_sens_du_service) {
		this.remarques_sens_du_service = remarques_sens_du_service;
	}

	public String getGestion_du_stress() {
		return gestion_du_stress;
	}

	public void setGestion_du_stress(String gestion_du_stress) {
		this.gestion_du_stress = gestion_du_stress;
	}

	public String getConfiance_en_soi() {
		return confiance_en_soi;
	}

	public void setConfiance_en_soi(String confiance_en_soi) {
		this.confiance_en_soi = confiance_en_soi;
	}

	public String getRemarques_controle_de_soi() {
		return remarques_controle_de_soi;
	}

	public void setRemarques_controle_de_soi(String remarques_controle_de_soi) {
		this.remarques_controle_de_soi = remarques_controle_de_soi;
	}

	public String getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(String autonomie) {
		this.autonomie = autonomie;
	}

	public String getRigueur() {
		return rigueur;
	}

	public void setRigueur(String rigueur) {
		this.rigueur = rigueur;
	}

	public String getGestion_des_priorites() {
		return gestion_des_priorites;
	}

	public void setGestion_des_priorites(String gestion_des_priorites) {
		this.gestion_des_priorites = gestion_des_priorites;
	}

	public String getRemarques_organisation_methode() {
		return remarques_organisation_methode;
	}

	public void setRemarques_organisation_methode(String remarques_organisation_methode) {
		this.remarques_organisation_methode = remarques_organisation_methode;
	}

	public String getCompetences_fonctionnelles() {
		return competences_fonctionnelles;
	}

	public void setCompetences_fonctionnelles(String competences_fonctionnelles) {
		this.competences_fonctionnelles = competences_fonctionnelles;
	}

	public String getCompetences_manageriales() {
		return competences_manageriales;
	}

	public void setCompetences_manageriales(String competences_manageriales) {
		this.competences_manageriales = competences_manageriales;
	}

	public String getCompetences_commerciales() {
		return competences_commerciales;
	}

	public void setCompetences_commerciales(String competences_commerciales) {
		this.competences_commerciales = competences_commerciales;
	}

	public String getCompetences_techniques() {
		return competences_techniques;
	}

	public void setCompetences_techniques(String competences_techniques) {
		this.competences_techniques = competences_techniques;
	}

	public String getLangue_1() {
		return langue_1;
	}

	public void setLangue_1(String langue_1) {
		this.langue_1 = langue_1;
	}

	public Integer getId_langue_1() {
		return id_langue_1;
	}

	public void setId_langue_1(Integer id_langue_1) {
		this.id_langue_1 = id_langue_1;
	}

	public String getTest_langue_1() {
		return test_langue_1;
	}

	public void setTest_langue_1(String test_langue_1) {
		this.test_langue_1 = test_langue_1;
	}

	public String getLangue_2() {
		return langue_2;
	}

	public void setLangue_2(String langue_2) {
		this.langue_2 = langue_2;
	}

	public Integer getId_langue_2() {
		return id_langue_2;
	}

	public void setId_langue_2(Integer id_langue_2) {
		this.id_langue_2 = id_langue_2;
	}

	public String getTest_langue_2() {
		return test_langue_2;
	}

	public void setTest_langue_2(String test_langue_2) {
		this.test_langue_2 = test_langue_2;
	}

	public String getLangue_3() {
		return langue_3;
	}

	public void setLangue_3(String langue_3) {
		this.langue_3 = langue_3;
	}

	public Integer getId_langue_3() {
		return id_langue_3;
	}

	public void setId_langue_3(Integer id_langue_3) {
		this.id_langue_3 = id_langue_3;
	}

	public String getTest_langue_3() {
		return test_langue_3;
	}

	public void setTest_langue_3(String test_langue_3) {
		this.test_langue_3 = test_langue_3;
	}

	public String getLangue_4() {
		return langue_4;
	}

	public void setLangue_4(String langue_4) {
		this.langue_4 = langue_4;
	}

	public Integer getId_langue_4() {
		return id_langue_4;
	}

	public void setId_langue_4(Integer id_langue_4) {
		this.id_langue_4 = id_langue_4;
	}

	public String getTest_langue_4() {
		return test_langue_4;
	}

	public void setTest_langue_4(String test_langue_4) {
		this.test_langue_4 = test_langue_4;
	}

	public String getPoints_positifs() {
		return points_positifs;
	}

	public void setPoints_positifs(String points_positifs) {
		this.points_positifs = points_positifs;
	}

	public String getPoints_de_vigilance() {
		return points_de_vigilance;
	}

	public void setPoints_de_vigilance(String points_de_vigilance) {
		this.points_de_vigilance = points_de_vigilance;
	}

	public String getAvis_recrutement() {
		return avis_recrutement;
	}

	public void setAvis_recrutement(String avis_recrutement) {
		this.avis_recrutement = avis_recrutement;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	
	
	
}
