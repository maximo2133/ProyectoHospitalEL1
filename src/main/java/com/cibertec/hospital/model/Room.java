package com.cibertec.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomNum;
	private LocalDate admissionDate;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staff;
	
	
}
