package com.gvp.ora.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvp.ora.controller.service.UtilisateurService;
import com.gvp.ora.entities.AnswerProposition;
import com.gvp.ora.entities.Proposition;
import com.gvp.ora.entities.Utilisateur;
import com.gvp.ora.repo.AnswerPropositionRepo;
import com.gvp.ora.repo.PropositionRepo;
import com.gvp.ora.repo.UtilisateurRepo;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{

	@Autowired
	private UtilisateurRepo utilisateurRepo;
	
	@Autowired
	private PropositionRepo propositionRepo;
	
	@Autowired
	private AnswerPropositionRepo answerPropRepo;
	
	@Override
	public List<Utilisateur> getAllUser() {
		return utilisateurRepo.findAll();
	}

	@Override
	public List<Utilisateur> getUserByNom(String nom) {
		return utilisateurRepo.findByNom(nom);
	}

	@Override
	public List<Utilisateur> getUserByIdAdmin(Integer id_admin) {
		return utilisateurRepo.findByidAdministrateur(id_admin);
	}

	@Override
	public List<Proposition> getAllProposition() {
		return propositionRepo.findAll();
	}
	

}
