package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvp.ora.entities.GcmCategory;

public interface CatGcmRepo extends JpaRepository<GcmCategory, Integer> {

	GcmCategory findByName(String name);

}
