package com.cibertec.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.hospital.model.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
