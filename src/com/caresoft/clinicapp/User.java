package com.caresoft.clinicapp;

public class User {
	protected Integer id;
	protected int pin;
	
	// TO DO: Getters and setters
	// JRF below: 
	public Integer idGetter() {return id;}
	public void idSetter(Integer id) {id = this.id;}
	// does order of id / this.id matter in line above? 
	
	public int pinGetter() {return pin;}
	public void pinSetter( int pin) {pin = this.pin;}
	
	// Implement a constructor that takes an ID
	// JRF below: 
	
	public User(Integer id) {
		this.id = id; 
		System.out.println("Initiation of create new user process."); 
		System.out.println("New user created.  ID = " + id); 
	}

	// end of methods
}
