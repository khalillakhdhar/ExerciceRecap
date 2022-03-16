package com.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.model.Lit;

public interface LitRepository extends JpaRepository<Lit, Integer> {

}
