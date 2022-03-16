package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.model.Medecin;
import com.hibernate.repositories.MedecinRepository;

@Service
public class MedecinService {
@Autowired // background process
MedecinRepository medecinRepository;
public Medecin createMedecin(Medecin m)
{
	
return 	medecinRepository.save(m);
}
public List<Medecin> read()
{
return medecinRepository.findAll();	
}
public Optional<Medecin> searchById(int id)
{
	return medecinRepository.findById(id);
	
}
public void delete(int id)
{
medecinRepository.deleteById(id);	

}
}
