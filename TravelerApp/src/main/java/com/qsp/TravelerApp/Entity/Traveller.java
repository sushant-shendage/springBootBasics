package com.qsp.TravelerApp.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Traveller {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phoneNumber;
	private String password;
	@OneToOne
	private Passport passport;
	@OneToMany
	private List <Country> country;

}
