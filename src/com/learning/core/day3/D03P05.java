package com.learning.core.day3;
import java.util.*;
public class D03P05 {

    public static void printCombinations(int[] numbers, int k) {
        int[] result = new int[k]; 
    
        for (int i = 0; i < k; i++) {
            result[i] = i;
        }

        while (result[k - 1] < numbers.length) {
            
            for (int i = 0; i < k; i++) {
                System.out.print(numbers[result[i]] + " ");
            }
            System.out.print(",");
            
            int t = k - 1;
            while (t != 0 && result[t] == numbers.length - k + t) {
                t--;
            }
            result[t]++;
            for (int i = t + 1; i < k; i++) {
                result[i] = result[i - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Array Size");
    	int n=sc.nextInt();
    	int arr[] =new int[n];
    	System.out.println("Enter the Array Elements");
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    		}
    	System.out.println("Enter the K value");
    	int k =sc.nextInt(); 
        printCombinations(arr, k);
    }
}