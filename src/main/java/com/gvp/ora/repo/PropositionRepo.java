package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.Proposition;

@Repository
public interface PropositionRepo extends JpaRepository<Proposition, Integer> {
	
	

}
