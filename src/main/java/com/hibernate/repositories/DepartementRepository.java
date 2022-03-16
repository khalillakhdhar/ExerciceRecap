package com.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
