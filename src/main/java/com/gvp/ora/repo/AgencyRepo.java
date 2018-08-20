package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.AnswerQuestion;

@Repository
public interface AgencyRepo extends JpaRepository<Agency, Integer> {
	
	Agency findByName(String name);

}
