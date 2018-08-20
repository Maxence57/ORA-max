package com.gvp.ora.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gcmlevel")
public class GcmLevel {
	
	@Id
	@Column(name="id_gcmlevel")
	private Integer id;
	
	@Column(name="level")
	private Integer level;
	
	@Column(name="difficulty")
	private String difficulty;

	public GcmLevel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GcmLevel(Integer id, Integer level, String difficulty) {
		super();
		this.id = id;
		this.level = level;
		this.difficulty = difficulty;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	

}
