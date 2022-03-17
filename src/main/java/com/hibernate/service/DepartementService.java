package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.model.Departement;
import com.hibernate.repositories.DepartementRepository;

@Service
public class DepartementService {
@Autowired
DepartementRepository departementRepository;

public Departement createDepartement(Departement l)
{
	return departementRepository.save(l);
	
}
public List<Departement> readlistDepartement()
{
return departementRepository.findAll();	
}
public Optional<Departement> finddepartement(int id)
{
return departementRepository.findById(id);	
}
public void deleteOnedepartement(int id)
{
departementRepository.deleteById(id);	
}
	
	
	
}
