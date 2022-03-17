package com.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hibernate.model.Departement;
import com.hibernate.model.Lit;
import com.hibernate.model.Medecin;
import com.hibernate.repositories.MedecinRepository;
import com.hibernate.service.DepartementService;
import com.hibernate.service.LitService;
import com.hibernate.service.MedecinService;

@SpringBootApplication
public class ExerciceRecapApplication implements CommandLineRunner {
@Autowired
DepartementService departementService;
@Autowired
MedecinService medService;
@Autowired
LitService litapi;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExerciceRecapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Departement d=new Departement(1,"enfant", "médecine pour les petit 1-14 ans");
		//Optional<Departement> d=departementService.finddepartement(1);
	
		
		departementService.createDepartement(d);
//Departement d=departementService.finddepartement(1).get();
Medecin m=new Medecin( 0,"jean", "user", d);
		medService.createMedecin(m);
		
		Medecin m1=medService.searchById(2).get();
		Lit l=new Lit("enfant","disponible",m1);
		litapi.createLit(l);
		
//		List<Medecin> lm=new ArrayList<Medecin>();
//		lm=medService.read();
//		for(Medecin m: lm)
//		{
//			// affichage du résultat
//			
//		}
		
	}

}
