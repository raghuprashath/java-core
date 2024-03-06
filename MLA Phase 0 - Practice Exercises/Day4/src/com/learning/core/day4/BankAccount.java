package com.learning.core.day4;

public class BankAccount {
	private int accNo;
	private String custName;
	private String accType;
	private float balance;
	public BankAccount(int accNo,String custName,String accType,float balance) {
		this.accNo=accNo;
		this.custName=custName;
		this.accType=accType;
		this.balance=balance;
	}
	public void deposit(float amount)throws NegativeAmount{
		if(amount>0) {
			balance+=amount;
		}
		else {
			throw new NegativeAmount("NegativeAmount");
		}
	}
	public float getBalance()throws LowBalanceException,NegativeAmount {
		float current=0.0f;
		if(balance>0) {
			if(accType=="Saving" && balance>1000) {
				current=current+balance;
			}
			else if(accType=="Current" && balance>5000) {
				current=current+balance;
			}
			else {
				throw new LowBalanceException("LowBalance");
			}
		}
		else {
			throw new NegativeAmount("Negative Amount");
		}
		return current;
	}
}