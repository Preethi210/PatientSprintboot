package com.example.Patient.controller;

import com.example.Patient.model.Patient;
import com.example.Patient.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/get/{patientID}")
    public Patient getPatient(@PathVariable String patientID) {
        return patientService.getPatient(patientID);
    }

    @PostMapping("/createPatient")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.create(patient);
    }

    @DeleteMapping("/deletePatient/{patientId}")
    public String deletePatient(@PathVariable String patientId) {
        patientService.delete(patientId);
        return "Patient Deleted";
    }

    @PutMapping("/updatePatient/{patientId}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable String patientId) {
        return patientService.update(patient, patientId);
    }

    @DeleteMapping("/deleteAll")
    public String deletePatients() {
        patientService.deleteAll();
        return "All Patient data deleted";
    }
}