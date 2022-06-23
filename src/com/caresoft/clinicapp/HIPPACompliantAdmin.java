package com.caresoft.clinicapp;

import java.util.ArrayList; // JRF assumes this goes under the package line.

public interface HIPPACompliantAdmin {

	abstract ArrayList<String> reportSecurityIncidents();
	
	// DEFAULT IMPLEMENTED METHODS
	// Used to print security incidents. 
	
//	JRF: below seems extraneous - commented out; 

//	public default void printSecurityIncidents() {
//		System.out.println(reportSecurityIncidents());
//	}
//	
//	
//	// QA Test, PASS/FAIL of reports against QA expected results
//	public default boolean adminQATest(ArrayList<String> expectedIncidents) {
//		if (reportSecurityIncidents().equals(expectedIncidents)) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
//		return reportSecurityIncidents().equals(expectedIncidents);
//	}

// end of interfaces
}




    
