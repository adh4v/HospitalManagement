package com.test.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Doctor;
import com.test.repository.DoctorRepository;
import com.test.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
    private DoctorRepository doctorRepository;
	
    public void setDoctorRepository(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    @Override
    public Optional<Doctor> getDoctorById(int id) {
        return doctorRepository.findById(id);
    }
    @Override
    public void deleteDoctor(int id) {
        doctorRepository.deleteById(id);
    }
	@Override
	public List<Doctor> updateDoctor(int id, Doctor updatedDoctor) {
		Optional<Doctor> existingDoctorOpt = doctorRepository.findById(id);
		return doctorRepository.findAll();
	}
}
