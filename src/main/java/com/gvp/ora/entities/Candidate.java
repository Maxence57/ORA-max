package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "candidate") // doit correspondre au nom de la table dans Postgres
public class Candidate {

	@Id
	@Column(name="id_candidate") // obligÃ© de rajouter pour correspondra a la base de donnÃ© --> sinon exception null id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name")
	private String name;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "id_gender")
	private Integer id_gender;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "birthdate")
	private Date birthdate;				// datatype choisi "Date"
	@Column(name = "address")
	private String address;
	@Column(name = "postal_code")
	private String postal_code;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "mail")
	private String mail;
	@Column(name = "personal_phone")
	private String personal_phone;
	@Column(name="fixed_phone")
	private String fixed_phone;	
	@Column(name = "last_degree")
	private String last_degree;
	@Column(name = "year_last_degree")
	private Integer year_last_degree;
	@Column(name = "english_level")
	private Integer english_level;
	@Column(name = "german_level")
	private Integer german_level;
	@Column(name = "spanish_level")
	private Integer spanish_level;
	@Column(name = "italian_level")
	private Integer italian_level;
	
	
	public Utilisateur(Integer id, String name, String first_name, Integer id_gender, String nationality, Date birthdate, String address, String postal_code, String city, String country, 
			, String mail, String personal_phone, String fixed_phone, String last_degree, Integer year_last_degree, Integer english_level, Integer german_level, Integer spanish_level, Integer italian_level) {
		super();
		this.id = id;
		this.name = name;
		this.first_name = first_name;
		this.id_gender = id_gender;
		this.nationality = nationality;
		this.birthdate = birthdate;
		this.address = address;
		this.postal_code = postal_code;
		this.city = city;
		this.country = country;
		this.mail = mail;
		this.personal_phone = personal_phone;
		this.fixed_phone = fixed_phone;
		this.last_degree = last_degree;
		this.year_last_degree = year_last_degree;
		this.english_level;
		this.german_level;
		this.spanish_level;
		this.italian_level;
	}
	
	
	public Candidate() {
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
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Integer getId_gender() {
		return id_gender;
	}
	public void setId_gender(String id_gender) {
		this.id_gender = id_gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getbirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPersonal_phone() {
		return personal_phone;
	}
	public void setPersonal_phone(String personal_phone) {
		this.personal_phone = personal_phone;
	}
	public String getFixed_phone() {
		return fixed_phone;
	}
	public void setFixed_phone(String fixed_phone) {
		this.fixed_phone = fixed_phone;
	}
	public Integer getLast_degree() {
		return last_degree;
	}
	public void setLast_degree(String last_degree) {
		this.last_degree = last_degree;
	}
	public Integer getYear_last_degree() {
		return year_last_degree;
	}
	public void setId_gcmlevel(Integer year_last_degree) {
		this.year_last_degree = year_last_degree;
	}
	public Integer getEnglish_level() {
		return english_level;
	}
	public void setEnglish_level(Integer english_level) {
		this.english_level = english_level;
	}
	public Integer getGerman_level() {
		return german_level;
	}
	public void setGerman_level(Integer german_level) {
		this.german_level = german_level;
	}
	public Integer getSpanish_level() {
		return spanish_level;
	}
	public void setSpanish_level(Integer spanish_level) {
		this.spanish_level = spanish_level;
	}



	@Override
	public String toString() {
		return "Candidate [id=" + id + ", nom=" + name + ", prenom=" + first_name + ", sexe=" + id_gender + ", nationalité=" + nationalité + 
				", date de naissance=" + birthdate + ", addresse=" + address + ", code postal=" + postal_code + ", ville=" + city + 
				", pays=" + country + ", mail=" + mail + ", téléphone personnel=" + personal_phone + ", téléphone fixe=" + fixed_phone +
				", dernier diplôme=" + last_degree + ", année dernier diplôme=" + year_last_degree + ", niveau d'anglais=" + english_level +
				", niveau d'allemand=" + german_level + ", niveau d'espagnol=" + spanish_level + ", niveau d'italien=" + italian_level+ "]";
	}
	
}
