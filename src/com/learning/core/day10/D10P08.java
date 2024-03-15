package com.learning.core.day10;

public class D10P08 {
	public static int mul(int x,int y)
	{
		return x*y;
	}
	public static int div(int x,int y)
	{
		try
		{
			return x/y;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide a value by Zero");
		}
		return -1;
	}
}