package com.patient.patient.service;

import com.patient.patient.model.Patient;
import com.patient.patient.repositary.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceJpa {

    @Autowired

    private PatientRepo patientRepo;

    public void savePatientJap(Patient patient){

        patientRepo.save(patient);
    }

    public void saveAllPatient(List<Patient> patients)
    {
        patientRepo.saveAll(patients);
    }

    public List<Patient> getAllPatienit(){
        return patientRepo.findAll();
    }

    public Optional<Patient> getPatientById(int id){
        System.out.println(id);
        return patientRepo.findById(id);
    }
      public void updateById(Patient patient){
          patientRepo.save(patient);
      }

}
