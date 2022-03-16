package com.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Lit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String departement;
String etat;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id_responsable" , referencedColumnName = "id")
private Medecin medecin;

}
