package com.learning.core.day5;

import java.util.*;

public class D05P01 {
	public static void main(String[] args)
	{  
	   String em,stu;
	   Employee e = new Employee("Arun",912345678,"LA78833DG",1101);
	   Student s = new Student("Joseph",912341278,2210, "SJLD1717K");
	   
	   Register<Employee> rg = new Register<Employee>(e);
	   Register<Student>  rg1 = new Register<Student>(s);
		   System.out.println(rg.genertaeRegisterId(e) +" " + e.name +" "+ e.phoneNo+" "+ e.passportNo+ " "+ e.employeeid);
	       System.out.println(rg1.genertaeRegisterId(s) +" " + s.name +" "+ s.phoneno+" "+ s.licenseNo + " "+ s.panCardNo);
	   
	}
	

}