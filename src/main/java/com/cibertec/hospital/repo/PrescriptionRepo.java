package com.cibertec.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.hospital.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{

}
