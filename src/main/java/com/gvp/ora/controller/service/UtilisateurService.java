package com.gvp.ora.controller.service;

import java.util.List;

import com.gvp.ora.entities.AnswerProposition;
import com.gvp.ora.entities.Proposition;
import com.gvp.ora.entities.Utilisateur;


public interface UtilisateurService {

	public List<Utilisateur> getAllUser();
	
	public List<Utilisateur> getUserByIdAdmin(Integer id_admin);
	
	public List<Utilisateur> getUserByNom(String nom);

	public List<Utilisateur> getUserByPrenom(String prenom);
	
	public List<Utilisateur> getUserByDas(String das);
	
	public List<Utilisateur> getUserByIdOra(String id_ora);
	
	public List<Utilisateur> getUserByPassword(String password);
	
	public List<Utilisateur> getUserByMail(String mail);
	
}