package com.cibertec.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	PrescriptionService prescriptionService;
	
	@GetMapping
	public ResponseEntity<List<Prescription>> list(){
		return new ResponseEntity<List<Prescription>> (prescriptionService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription r) {
		return new ResponseEntity<Prescription>(prescriptionService.add(r),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription r) {
		return new ResponseEntity<Prescription>(prescriptionService.update(r),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
