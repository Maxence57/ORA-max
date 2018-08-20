package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.LangProg;

@Repository
public interface LangProgRepo extends JpaRepository<LangProg, Integer> {
	
	LangProg findByName(String name);

}
