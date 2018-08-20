package com.gvp.ora.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "questiontype")
public class TypeQuestion implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = -9043762021430349027L;

	@Id
	@Column(name = "id_questiontype")
	private Integer id;

	@Column(name = "name")
	private String type;

	public TypeQuestion(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public TypeQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
