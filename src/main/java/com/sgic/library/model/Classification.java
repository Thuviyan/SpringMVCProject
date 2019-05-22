package com.sgic.library.model;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//entity -> for table creating
@Entity
@Table(name="classification")
public class Classification {
	
	
	/* variable name must be camelCase */
	// id -> primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="classification_name")
	private String classificationName;

	public int getId() {
		return id;
	} 

	public void setId(int id) {
		this.id = id;
	}

	public String getClassificationName() {
		return classificationName;
	}

	public void setClassificationName(String classificationName) {
		this.classificationName = classificationName;
	}
}
