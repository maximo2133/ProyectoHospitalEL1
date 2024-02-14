package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Prescription;

public interface PrescriptionService {
	public List<Prescription> list();
	public Prescription add(Prescription r);
	public Prescription update(Prescription r);
	public void delete(int id);
}
