package com.gvp.ora.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="programminglanguage")
public class LangProg {
	
	@Id
	@Column(name="id_programminglanguage")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	public LangProg() {
		super();
	}

	public LangProg(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	

}
