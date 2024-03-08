package com.learning.core.day5;

import java.util.*;

public class D05P01 {
	public static void main(String[] args)
	{  
	   String em,stu;
	   //Employee e = new Employee("Arun",912345678,"LA78833DG",1101);
	   Student s = new Student("Joseph",912341278,2210, "SJLD1717K");
	   
	   //Register<Employee> r1 = new Register<Employee>(e);
	   Register<Student>  r2 = new Register<Student>(s);
		   //System.out.println(r1.genertaeRegisterId(e) +" " + e.name +" "+ e.phoneNo+" "+ e.passportNo+ " "+ e.employeeid);
	       System.out.println(r2.genertaeRegisterId(s) +" " + s.name +" "+ s.phoneno+" "+ s.licenseNo + " "+ s.panCardNo);
	   
	}
	

}