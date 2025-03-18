package com.test.service;

import java.util.List;

import com.test.entity.Patient;

public interface PatientService {
	
	Patient savePatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void deletePatient(int id);
}
