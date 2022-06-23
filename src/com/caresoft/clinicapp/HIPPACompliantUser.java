package com.caresoft.clinicapp;

public interface HIPPACompliantUser {
    // below provided by platform, leave alone
	abstract boolean assignPin(int pin);
    
	abstract boolean accessAuthorized(Integer confirmedAuthID);

}
