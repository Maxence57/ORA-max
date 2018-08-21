package com.gvp.ora.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gvp.ora.entities.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

	public List<Users> findByNom(String nom);
	
	public List<Users> findByidId_administrator(Integer id_administrator);
	
}
