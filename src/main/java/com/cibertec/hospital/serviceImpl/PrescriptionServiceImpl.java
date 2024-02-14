package com.cibertec.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.repo.PrescriptionRepo;
import com.cibertec.hospital.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription r) {
		return prescriptionRepo.save(r);
	}

	@Override
	public Prescription update(Prescription r) {
		return prescriptionRepo.save(r);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}

}
