package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Pharmacy;

public interface PharmacyService {
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy h);
	public Pharmacy update(Pharmacy h);
	public void delete(int id);
}
