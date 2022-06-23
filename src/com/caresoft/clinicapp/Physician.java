package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class Physician extends User 
implements HIPPACompliantUser 
{

	
//... imports class definition...
    

	// Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Setters & Getters
    // JRF below: 
    
    public ArrayList<String> patientNotesGetter() {return patientNotes;}
    public void patientNotesSetter( ArrayList<String>  patientNotes) {patientNotes = this.patientNotes;}
 
    // TO DO: Constructor that takes an ID
    // JRF below: 
    public Physician(Integer id) {
    	super(id);
    	System.out.println("New user type: Physician."); 
    	
    }
    
    // TO DO: Implement HIPAACompliantUser!
    
   
    public boolean assignPin(int pinIncoming) {
    	System.out.println("Assign PIN Initiated."); 
    	
//    	String pinIncomingStringVersion = Integer.toString(pinIncoming); 
//    	System.out.println("pinIncomingDigitCount: " + pinIncomingDigitCount); 
    	
    	int pinIncomingDigitCount = Integer.toString(pinIncoming).length();  
    	
    	
    	if ( pinIncomingDigitCount == 4 ) {
    		pinIncoming = pin; 
//    		System.out.println("true returned"); 
//    		System.out.println("Pin assignment successful."); 
    		return true; 
    	}
    	else {
//    		System.out.println("false returned");
//    		System.out.println("Pin assignment failed - invalid pin submitted."); 
    		return false;
    	}
    }
    

    public boolean accessAuthorized(Integer id) {
    	System.out.println("Access Authorization Initiated"); 
    	
    	if (id == this.id  ) {
    		return true; 	
    	} else {
    		return false; 
    	}
    }
    
	// not really sure what's up with below, leaving well enough alone for now
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format("Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
	
}
