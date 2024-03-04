package com.learning.core.day2;
import java.util.*;

public class D02P15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of numbers");
		int n=sc.nextInt();
		int positive_number=0;
		int negative_number=0;
		int zero=0;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(x>0) {
				positive_number+=1;
			}
			else if(x<0) {
				negative_number+=1;
			}
			else {
				zero+=1;
			}
		}
		System.out.println("No of Positive Numbers:"+positive_number);
		System.out.println("No of Negative Numbers:"+negative_number);
		System.out.println("No of Zeros Numbers:"+zero);
	}
}
