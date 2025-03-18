package com.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Patient;
import com.test.repository.PatientRepository;
import com.test.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired
	PatientRepository patientRepository;
	
	public void setPatientRepository(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(int id) {
		return patientRepository.findById(id).orElse(null);
	}

	@Override
	public void deletePatient(int id) {
		patientRepository.deleteById(id);
		
	}
	
}
