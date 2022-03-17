package com.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(nullable = false, unique = true)
private String titre;


private String description;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getTitre() {
	return titre;
}


public void setTitre(String titre) {
	this.titre = titre;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public Departement() {
	super();
}


public Departement(int id, String titre, String description) {
	super();
	this.id = id;
	this.titre = titre;
	this.description = description;
}


public Departement(String titre, String description) {
	super();
	this.titre = titre;
	this.description = description;
}





}
