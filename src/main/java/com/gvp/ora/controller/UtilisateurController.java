package com.gvp.ora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gvp.ora.controller.service.UtilisateurService;
import com.gvp.ora.entities.AnswerProposition;
import com.gvp.ora.entities.Proposition;
import com.gvp.ora.entities.Utilisateur;
import com.gvp.ora.repo.AnswerPropositionRepo;

@RestController
public class UtilisateurController {
	

	@Autowired
	private UtilisateurService serviceUtilisateur;
	
	@Autowired
	private AgencyService serviceAgency;
	
	@Autowired
	private AdministratorService serviceAdministrator;
	
	@Autowired
	private GenderService serviceGender;
	
	@Autowired
	private CatGcmService serviceCatGcm;

	@Autowired
	private LevGcmService serviceLevGcm;

	
	@RequestMapping(value="api/users/findAll")
	public List<Utilisateur> getAllUser() {
		return serviceUtilisateur.getAllUser();
	}
	
	@RequestMapping(value="api/test/hello",produces=MediaType.APPLICATION_JSON_VALUE)
	public Utilisateur testUser() {
		return new Utilisateur(2,"polo","marchal","A71","A784","mdp",1,2,5,10);
	}
	
	
	@RequestMapping(value="api/userByIdAdmin/{id_admin}")
	public List<Utilisateur> getUtilisateurByIdAdmin(@PathVariable Integer id_admin) {
		return serviceUtilisateur.getUserByIdAdmin(id_admin);
	}
	
	@RequestMapping(value="api/user/{nom}")
	public List<Utilisateur> getUtilisateurByNom(@PathVariable String nom) {
		return serviceUtilisateur.getUserByNom(nom);
	}
	
	@RequestMapping(value="api/user/{prenom}")
	public List<Utilisateur> getUtilisateurByPrenom(@PathVariable String prenom) {
		return serviceUtilisateur.getUserByPrenom(Prenom);
	}
	
	@RequestMapping(value = "api/gender/findAll")
	public List<Gender> getAllGender() {
		return GenderService.getAllGender();
	}
	
	@RequestMapping(value="api/user/{das}")
	public List<Utilisateur> getUtilisateurByDas(@PathVariable String das) {
		return serviceUtilisateur.getUserByDas(Das);
	}
	
	@RequestMapping(value="api/user/{id_ora}")
	public List<Utilisateur> getUtilisateurByIdOra(@PathVariable String id_ora) {
		return serviceUtilisateur.getUserByIdOra(id_ora);
	}
	
	@RequestMapping(value="api/user/{password}")
	public List<Utilisateur> getUtilisateurByPassword(@PathVariable String paswword) {
		return serviceUtilisateur.getUserByPassword(password);
	}
	
	@RequestMapping(value="api/user/{mail}")
	public List<Utilisateur> getUtilisateurByMail(@PathVariable String mail) {
		return serviceUtilisateur.getUserByMail(mail);
	}	
	
	@RequestMapping(value = "api/agency/findAll")
	public List<Agency> getAllAgency() {
		return AgencyService.getAllAgency();
	}
	
	@RequestMapping(value = "api/administrator/findAll")
	public List<Administrator> getAllAdministrator() {
		return AdministratorService.getAllAdministrator();
	}
	
	@RequestMapping(value = "api/catGcm/findAll")
	public List<GcmCategory> getAllCatGcm() {
		return CatGcmService.getAllCatGcm();
	}
	
	@RequestMapping(value = "api/levGcm/findAll")
	public List<GcmLevel> getAllLevGcm() {
		return LevGcmService.getAllGcm();
	}	
	
}