package com.learning.core.day4;

public class Validator {
	private String applicantName;
	private String postApplied;
	private int applicantAge;
	public boolean isValidApplicantName(String name) throws CatheyBankException{
		if(name.length()==0) {
			throw new CatheyBankException("Invalid Applicant Name");
		}
		else {
			return true;
		}
	}
	public boolean isValidPost(String s) throws CatheyBankException{
		if(s.equals("Probationary Officer")||s.equals("Assistant")||s.equals("Special Carde Officer")) {
			return true;
		}
		else {
			throw new CatheyBankException("Invalid Post");
		}
	}
	public boolean isValidAge(int age) throws CatheyBankException{
		if(age>=18 && age<=30) {
			return true;
		}
		else {
			throw new CatheyBankException("Invalid Age");
		}

	}

}
