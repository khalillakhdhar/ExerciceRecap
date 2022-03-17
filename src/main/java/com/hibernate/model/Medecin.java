package com.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Medecin {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nom;
private String prenom;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "departement", referencedColumnName = "titre")
private Departement departement;
@OneToMany(mappedBy = "medecin")
List<Lit> lits;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Departement getDepartement() {
	return departement;
}
public void setDepartement(Departement departement) {
	this.departement = departement;
}
public Medecin() {
	
}
public Medecin(int id, String nom, String prenom, Departement departement) {
	
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.departement = departement;
}
public Medecin(String nom, String prenom, Departement departement, List<Lit> lits) {
	
	this.nom = nom;
	this.prenom = prenom;
	this.departement = departement;
	this.lits = lits;
}






}
