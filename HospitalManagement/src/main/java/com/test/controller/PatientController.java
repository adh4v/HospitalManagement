package com.test.controller;
import com.test.entity.Patient;
import com.test.service.PatientService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
    private PatientService patientService;

    @PostMapping("/create")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("/listAll")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("getPatient/{id}")
    public Patient getPatientById(@PathVariable int id) {
        return patientService.getPatientById(id);
    }

    @DeleteMapping("delete/{id}")
    public String deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
        return "Patient deleted successfully";
    }
}
