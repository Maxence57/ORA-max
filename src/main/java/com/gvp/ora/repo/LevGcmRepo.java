package com.gvp.ora.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvp.ora.entities.GcmCategory;

public interface LevGcmRepo extends JpaRepository<GcmLevel, Integer> {

	GcmLevel findByName(String name);

}
