package com.qsp.TravelerApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Place{

@Id
private int id;
private String description;
private int rating;

}
