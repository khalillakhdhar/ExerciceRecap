package com.hibernate.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Lit implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String departement;
String etat;

@ManyToOne(cascade = CascadeType.MERGE)
@JoinColumn(name = "id_responsable" , referencedColumnName = "id")
private Medecin medecin;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getDepartement() {
	return departement;
}

public void setDepartement(String departement) {
	this.departement = departement;
}

public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

public Medecin getMedecin() {
	return medecin;
}

public void setMedecin(Medecin medecin) {
	this.medecin = medecin;
}

public Lit(int id, String departement, String etat, Medecin medecin) {
	super();
	this.id = id;
	this.departement = departement;
	this.etat = etat;
	this.medecin = medecin;
}

public Lit() {
	super();
}

public Lit(String departement, String etat, Medecin medecin) {
	super();
	this.departement = departement;
	this.etat = etat;
	this.medecin = medecin;
}

public Lit(String departement, String etat) {
	super();
	this.departement = departement;
	this.etat = etat;
}



}
