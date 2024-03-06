package com.learning.core.day4;

import java.util.Scanner;

public class D04P03 {
	public static void main(String[] args) {
		Validator c= new Validator();
		Scanner sc = new Scanner(System.in);
		try {
			boolean name = c.isValidApplicantName(sc.nextLine());
			boolean post =  c.isValidPost(sc.nextLine());
			boolean age = c.isValidAge(sc.nextInt());
			System.out.println("all deatils valid");
		}
		catch (CatheyBankException e) {
			System.out.print(e.getMessage());
		}

		
	}
}
