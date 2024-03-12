package com.learning.core.day4;


public class CricketRating {
	String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	float avgRating;
	private String Coins;
	public CricketRating(String playerame,float critic1,float critic2,float critic3) {
		this.playerName=playerame;
		this.critic1=critic1;
		this.critic2=critic2;
		this.critic3=critic3;
	}
	public void calculateAverageRating(float critic1,float critic2) {
		this.avgRating=(this.critic1+this.critic2)/2;
		
	}
	public void calculateAverageRating(float critic1,float critic2,float critic3) {
		this.avgRating=(this.critic1+this.critic2+this.critic3)/3;
	}
	public String calculateCoins()throws NotEligibleException {
		if(avgRating>7) {
			return "Gold";
		}
		else if(avgRating>5&& avgRating<=7) {
			return "silver";
		}
		else if(avgRating>5 && avgRating<=2) {
			return "copper";
		}
		else {
			throw new NotEligibleException("NotEligible");
		}
	}
	
}
