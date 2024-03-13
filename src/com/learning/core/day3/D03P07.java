package com.learning.core.day3;

import java.util.Scanner;

public class D03P07{

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.next();
        printSubsequences(s);
    }

    public static void printSubsequences(String s) {
        subsequences(s, "", 0);
    }

    public static void subsequences(String s, String current, int index) {
        int n = s.length();

        if (index == n) {
            System.out.print(current+" ");
            return;
        }

        subsequences(s, current + s.charAt(index), index + 1);
        subsequences(s,current, index + 1);
        System.out.println("Called");

    }
}
