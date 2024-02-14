package com.cibertec.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.model.Patient;
import com.cibertec.hospital.repo.PatientRepo;
import com.cibertec.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public List<Patient> list() {
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		return patientRepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		return patientRepo.save(p);
	}

	@Override
	public void delete(int id) {
		patientRepo.deleteById(id);
	}

}
