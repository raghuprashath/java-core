package com.learning.core.day10;

import java.io.*;

import java.util.*;

public class D10P03 {
	public static void main(String[] args)
	{
		try
		{
			FileInputStream f=new FileInputStream("Tester.txt");
			ObjectInputStream o=new ObjectInputStream(f);
			User u=(User)o.readObject();
			System.out.println(u.getRollno()+" "+u.getName()+" "+u.getAge()+" "+u.getAddress());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}