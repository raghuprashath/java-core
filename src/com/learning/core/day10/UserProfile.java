package com.learning.core.day10;

import static org.junit.Assert.*;

import org.junit.*;

public class UserProfile {

	@Test(timeout = 2000)
    public void testName() {

		boolean  isValid1 = D10P10.validateUsername("RaghuPrashath");
        assertEquals(true,isValid1);
        
        boolean isValid2 = D10P10.validateUsername("Smirthi Mandhana");
        assertEquals(false,isValid2);

    }


	@Test(timeout = 2000)
    public void testPassword() {
    	
        boolean isValid1 = D10P10.validatePassword("Ra12@56hg");
        assertEquals(true,isValid1);

        boolean isValid2 = D10P10.validatePassword("rag06"); 
        assertEquals(false,isValid2);
        
    }
}