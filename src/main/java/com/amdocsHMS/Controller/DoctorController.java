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
import com.amdocsHMS.Data.Doctor;
import com.amdocsHMS.Data.Patient;
import com.amdocsHMS.Repository.DoctorRepository;


@RestController
@RequestMapping("/hms/v1")
public class DoctorController {
	
	@Autowired
    private DoctorRepository doctorRepository;
	
	@GetMapping("/doctors")
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }
	
	@GetMapping("/doctors/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable(value = "id") Long doctorId)
    throws ResourceNotFoundException {
		Doctor employee = doctorRepository.findById(doctorId)
            .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + doctorId));
        return ResponseEntity.ok().body(employee);
    }
	
    @PostMapping("/doctors")
    public Doctor createEmployee(@Valid @RequestBody Doctor doctorId) {
        return doctorRepository.save(doctorId);
    }
    
    @DeleteMapping("/doctors/{id}")
    public void deleteEmployee(@PathVariable("id") long id) {
    	doctorRepository.deleteById(id);
    }
    
    @PutMapping("/doctors")
    public void updateEmployee(@RequestBody Doctor doctor) {
       doctorRepository.save(doctor);
    }
}
