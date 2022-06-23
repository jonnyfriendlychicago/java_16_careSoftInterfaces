package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPPACompliantUser
, HIPPACompliantAdmin 
{

//... imports class definition...
    

	// Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Setters & Getters
    // JRF: below...
    public String roleGetter() {return role;}
	public void roleSetter(String role) {role = this.role;}
	
    
    public ArrayList<String> securityIncidentsGetter() {return securityIncidents;}
    public void securityIncidentsSetter( ArrayList<String>  securityIncidents) {securityIncidents = this.securityIncidents;}
    
    // TO DO: Implement a constructor that takes an ID and a role
    
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role; 
    	this.securityIncidents = new ArrayList<String>(); // this was missing before; need to create instance of the array with the instance of the object. (yes??)
    	System.out.println("New user type: AdminUser."); 
    	System.out.println("Role: " + role); 
    }
    
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin) {
    	System.out.println("Assign PIN Initiated."); 
    	
    	int pinIncomingDigitCount = Integer.toString(pin).length();  
    	
    	
    	if ( pinIncomingDigitCount >= 6 ) {
    		this.pin = pin;  
    		return true; 
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	System.out.println("Access Authorization Initiated."); 
    	
    	if (confirmedAuthID == id ) {
    		return true; 	
    	} else {
    		authIncident(); 
//    		System.out.println("securityIncidents: "); 
//    		System.out.println(securityIncidents); 
    		return false; 
    	}
    }
    
    // TO DO: Implement HIPAACompliantAdmin!
	// JRF below: 
    public ArrayList<String> reportSecurityIncidents() {
//		System.out.println("method placeholder: reportSecurityIncidents");
		return securityIncidents; 
	}
	
	
    
    // JRF: below seems extraneous - commented out; 
//    public void newIncident(String notes) {
//        String report = String.format(
//            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
//            new Date(), this.id, notes
//        );
//        securityIncidents.add(report);
//    }
//    
    public void authIncident() {
        String report = String.format(
            "\n Datetime Submitted: %s. ID: %s Notes: %s ", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER. \n"
        );
        securityIncidents.add(report);
    }
    

    
}
