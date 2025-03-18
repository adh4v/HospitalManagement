package com.test.service;

import java.util.List;
import java.util.Optional;

import com.test.entity.Doctor;

public interface DoctorService {
	
	Doctor saveDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();
    Optional<Doctor> getDoctorById(int id);
    List<Doctor> updateDoctor(int id, Doctor updatedDoctor);
    void deleteDoctor(int id);
}
