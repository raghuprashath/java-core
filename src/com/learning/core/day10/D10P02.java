package com.learning.core.day10;

import java.io.*;

import java.util.*;

public class D10P02{
	public static void main(String[] args)
	{
		 User u=new  User(2593477,"Raghu",23,"Salem");
		 ValidateUser v= new  ValidateUser();
		 try
		 {
			 boolean name=v.checkname(u.getName());
			 boolean address=v.checkadd(u.getAddress());
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Whether you want to add it in file:true/false");
			 System.out.println("Enter your choice");
			 boolean ans=sc.nextBoolean();
			 if(ans==true)
			 {
				 try 
				 {
					FileOutputStream f=new FileOutputStream("Tester.txt");
					ObjectOutputStream o=new ObjectOutputStream(f);
					o.writeObject(u);
					o.flush();
					o.close();
					
				 }
				 catch (Exception e) 
				 {
					e.printStackTrace();
				}
			 }
		 }
		 catch(nameException | addressException e)
		 {
			 e.printStackTrace();
		 }
	}
		
	

}