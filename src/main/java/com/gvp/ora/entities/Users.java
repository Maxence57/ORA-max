package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users") // doit correspondre au nom de la table dans Postgres
public class Users {

	@Id
	@Column(name="id_users") // obligé de rajouter pour correspondra a la base de donné --> sinon exception null id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name")
	private String name;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "id_gender")
	private Integer id_gender;
	@Column(name = "das")
	private String das;
	@Column(name = "id_ora")
	private String id_ora;
	@Column(name = "password_ora")
	private String password_ora;
	@Column(name = "mail")
	private String mail;
	@Column(name = "id_agency")
	private Integer id_agency;
	@Column(name="id_administrator")
	private Integer id_administrator;	
	@Column(name = "id_gcmcategory")
	private Integer id_gcmcategory;
	@Column(name = "id_gcmlevel")
	private Integer id_gcmlevel;
	
	
	
	
	
	
	public Utilisateur(Integer id, String name, String first_name, Integer id_gender, String das, String id_ora, 
			String password_ora, String mail, Integer id_agency, Integer id_administrator, Integer id_gcmcategory, Integer id_gcmlevel) {
		super();
		this.id = id;
		this.name = name;
		this.first_name = first_name;
		this.id_gender = id_gender;
		this.das = das;
		this.id_ora = id_ora;
		this.password_ora = password_ora;
		this.mail = mail;
		this.id_agency = id_agency;
		this.id_administrator = id_administrator;
		this.id_gcmcategory = id_gcmcategory;
		this.id_gcmlevel = id_gcmlevel;
	}
	
	
	public Utilisateur() {
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
	public void setId_gender(Integer id_gender) {
		this.id_gender = id_gender;
	}
	public String getDas() {
		return das;
	}
	public void setDas(String das) {
		this.das = das;
	}
	public String getId_ora() {
		return id_ora;
	}
	public void setId_ora(String id_ora) {
		this.id_ora = id_ora;
	}
	public String getPassword_ora() {
		return password_ora;
	}
	public void setPassword_ora(String password_ora) {
		this.password_ora = password_ora;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getId_agency() {
		return id_agency;
	}
	public void setId_agency(Integer id_agency) {
		this.id_agency = id_agency;
	}
	public Integer getId_administrator() {
		return id_administrator;
	}
	public void setId_administrator(Integer id_administrator) {
		this.id_administrator = id_administrator;
	}
	public Integer getId_gcmcategory() {
		return id_gcmcategory;
	}
	public void setId_gcmcategory(Integer id_gcmcategory) {
		this.id_gcmcategory = id_gcmcategory;
	}
	public Integer getId_gcmlevel() {
		return id_gcmlevel;
	}
	public void setId_gcmlevel(Integer id_gcmlevel) {
		this.id_gcmlevel = id_gcmlevel;
	}



	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + name + ", prenom=" + first_name + ", sexe=" + id_gender + ", das=" + das + ", id_connexion="
				+ id_ora + ", mdp_connexion=" + password_ora + ", mail=" + mail + ", id_agence=" + id_agency
				+ ", id_administrateur=" + id_administrator + ", id_categorie_gcm=" + id_gcmcategory
				+ ", id_niveau_gcm=" + id_gcmlevel + "]";
	}
	
}
