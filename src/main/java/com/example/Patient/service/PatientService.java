package com.example.Patient.service;

import com.example.Patient.model.Patient;
import com.example.Patient.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private  final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public  List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatient(String patientID) {
        return patientRepository.findById(patientID).orElse(null);
    }


    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    public void delete(String patientId) {
        patientRepository.deleteById(patientId);
    }

    public Patient update(Patient patient, String patientId) {
        Patient patient1 = patientRepository.findById(patientId).get();
        patient1.setname(patient.getname());
        patient1.setdoctor(patient.getdoctor());
        patientRepository.save(patient1);
        return patient1;
    }

    public void deleteAll() {
        patientRepository.deleteAll();
    }
}