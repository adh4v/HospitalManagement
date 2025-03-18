package com.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Doctor;
import com.test.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	
	@Autowired
    private DoctorService doctorService;
	
	@PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/listAll")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/getById/{id}")
    public Optional<Doctor> getDoctorById(@PathVariable int id) {
        return doctorService.getDoctorById(id);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteDoctor(@PathVariable int id) {
        doctorService.deleteDoctor(id);
        return "Doctor with ID " + id + " deleted successfully.";
    }
	
}
