package com.qsp.TravelerApp.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	private int id;
	private String passPortNumber;
	private String nationality;
	private String gender;
	private LocalDate dateOfIssue;
	private LocalDate dateOfExpiray;
	@OneToOne
	private Traveller traveller;
	
	
	

}
