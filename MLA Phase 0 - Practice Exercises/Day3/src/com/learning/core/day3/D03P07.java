package com.learning.core.day3;

import java.util.Scanner;

public class D03P07{

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.next();
        printSubsequences(s);
    }

    public static void printSubsequences(String input) {
        subsequences(input, "", 0);
    }

    private static void subsequences(String input, String current, int index) {
        int n = input.length();

        if (index == n) {
            System.out.print(current+" ");
            return;
        }

        subsequences(input, current + input.charAt(index), index + 1);
        subsequences(input, current, index + 1);
    }
}
