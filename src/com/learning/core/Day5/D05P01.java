package com.learning.core.day5;

import java.util.*;

public class D05P01 {
	public static void main(String[] args)
	{  
	   Employee E=new Employee("Arun",9123456780L,1101,"LA78833DG");
	   Student S=new Student("Joseph",9123456780L,2210,"SJLD1717K");
	   Register<Employee> r1 = new Register<>();
	   Register<Student>  r2 = new Register<>();
	   System.out.println(r1.generateRegisterId(E) +" " + E.name +" "+ E.phoneNo+" "+ E.employeeId+" "+E.passportNo);
       System.out.println(r2.generateRegisterId(S) +" " + S.name +" "+ S.phoneNo+" "+ S.licenseNo + " "+ S.panCardNo);
	}
}