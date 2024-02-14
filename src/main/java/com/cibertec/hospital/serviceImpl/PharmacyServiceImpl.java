package com.cibertec.hospital.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.model.Pharmacy;
import com.cibertec.hospital.repo.PharmacyRepo;
import com.cibertec.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Autowired
	PharmacyRepo pharmacyRepo;
	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy h) {
		return pharmacyRepo.save(h);
	}

	@Override
	public Pharmacy update(Pharmacy h) {
		return pharmacyRepo.save(h);
	}

	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}

}
