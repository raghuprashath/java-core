package com.learning.core.day4;

import java.util.Scanner;

public class D04P03 {
	public static void main(String[] args) {
		Validator c= new Validator();
		Scanner sc = new Scanner(System.in);
		try {
			String x=sc.nextLine();
			boolean name = c.isValidApplicantName(x);
			String y=sc.nextLine();
			boolean post =  c.isValidPost(y);
			int a=sc.nextInt();
			boolean age = c.isValidAge(a);
			System.out.println("all deatils valid");
		}
		catch (CatheyBankException e) {
			System.out.print(e.getMessage());
		}

		
	}
}
