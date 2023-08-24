package com.amdocsHMS.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.amdocsHMS.Exception.ResourceNotFoundException;
import com.amdocsHMS.Data.Patient;
import com.amdocsHMS.Repository.PatientRepository;




@RestController
@RequestMapping("/hms/v1")
public class PatientController {
	
	@Autowired
    private PatientRepository patientRepository;
	
	@GetMapping("/patients")
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }
	
	@GetMapping("/patients/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable(value = "id") Long patientId)
    throws ResourceNotFoundException {
		Patient patient = patientRepository.findById(patientId)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + patientId));
        return ResponseEntity.ok().body(patient);
    }
    
    @PostMapping("/patients")
    public Patient createEmployee(@Valid @RequestBody Patient patientId) {
        return patientRepository.save(patientId);
    }
    
    @DeleteMapping("/patients/{id}")
    public void deleteEmployee(@PathVariable("id") long id) {
    	patientRepository.deleteById(id);
    }
    
    @PutMapping("/patients")
    public void updateEmployee(@RequestBody Patient patient) {
       patientRepository.save(patient);
    }
}
