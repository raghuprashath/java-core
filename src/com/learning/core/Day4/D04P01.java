package com.learning.core.day4;

import java.util.Scanner;

public class D04P01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Account Details");
		int accNo=sc.nextInt();
		String custName=sc.next();
		String accType=sc.next();
		float balance=sc.nextFloat();
		BankAccount b=new BankAccount(accNo, custName, accType, balance);
		try {
			System.out.println(b.getBalance());

		}
		catch(LowBalanceException e){
			System.out.println(e.getMessage());
		}
		catch (NegativeAmount e) {
			System.out.println(e.getMessage());
		}
	}
}
