package com.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
