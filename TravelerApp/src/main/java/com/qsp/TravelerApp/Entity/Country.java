package com.qsp.TravelerApp.Entity;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Country {
	private int id;
	private String name;
	private List<Place> places;

}
