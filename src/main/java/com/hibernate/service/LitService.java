package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.model.Lit;
import com.hibernate.repositories.LitRepository;

@Service
public class LitService {
@Autowired
LitRepository litRepository;

public Lit createLit(Lit l)
{
	return litRepository.save(l);
	
}
public List<Lit> readlistLit()
{
return litRepository.findAll();	
}
public Optional<Lit> findlit(int id)
{
return litRepository.findById(id);	
}
public void deleteOnelit(int id)
{
litRepository.deleteById(id);	
}
	
	
	
}
