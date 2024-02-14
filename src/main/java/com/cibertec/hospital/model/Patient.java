package com.cibertec.hospital.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String patientFname;
	private String patientLname;
	private String patientAddress;
	private String patientPhoneNumber;
	
	@ManyToOne
	@JoinColumn(name="pharmacy_id")
	private Pharmacy pharmacy;
	
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="Appointment",
			joinColumns = @JoinColumn(name="patient_id"),
			inverseJoinColumns = @JoinColumn(name="doctor_id")
			)
	private Set<Doctor> doctor = new HashSet<>();

}
