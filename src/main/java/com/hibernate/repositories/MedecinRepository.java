package com.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {

}
