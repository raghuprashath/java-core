package com.learning.core.day4;

import java.util.Scanner;

public class D04P02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		String playerName=sc.next();
		float critic1=sc.nextFloat();
		float critic2=sc.nextFloat();
		float critic3=sc.nextFloat();
		CricketRating c=new CricketRating(playerName, critic1, critic2, critic3);
		c.calculateAverageRating(critic1, critic2);
		c.calculateAverageRating(critic1, critic2, critic3);
		System.out.println(c.playerName+" "+c.avgRating+" "+c.calculateCoins());

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
