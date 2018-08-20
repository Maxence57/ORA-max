package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.AnswerProposition;

@Repository
public interface AnswerPropositionRepo extends JpaRepository<AnswerProposition, Integer>{

}
