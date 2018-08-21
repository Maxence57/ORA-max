package com.gvp.ora.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer> {

	public List<Candidate> findByNom(String nom);
	
	public List<Candidate> findByidFirst_name(Integer first_name);
	
}
