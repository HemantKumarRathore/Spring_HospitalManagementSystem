package com.amdocsHMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocsHMS.Data.Doctor;
import com.amdocsHMS.Data.Patient;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Long>{

}
