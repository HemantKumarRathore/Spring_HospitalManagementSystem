package com.amdocsHMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocsHMS.Data.Doctor;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, Long>{

}
