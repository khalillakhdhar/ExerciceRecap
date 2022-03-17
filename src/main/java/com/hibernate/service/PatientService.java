package com.hibernate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.model.Patient;
import com.hibernate.repositories.PatientRepository;

@Service
public class PatientService {
@Autowired // background process
PatientRepository patientRepository;
public Patient createPatient(Patient m)
{
	
return 	patientRepository.save(m);
}
public List<Patient> read()
{
return patientRepository.findAll();	
}
public Optional<Patient> searchById(int id)
{
	return patientRepository.findById(id);
	
}
public void delete(int id)
{
patientRepository.deleteById(id);	

}
}
