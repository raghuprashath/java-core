package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String");
        String input =sc.next();
        int del =noofdeletions(input);
        System.out.println(del);
    }
    public static int noofdeletions(String s) {
        int longestPalindromeLength = longestPalindromeSubsequence(s);
        return s.length() - longestPalindromeLength;
    }

    public static int longestPalindromeSubsequence(String s) {
        int n = s.length();
        int[][] d = new int[n][n];
        for (int i = 0; i < n; i++) {
            d[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j) && len == 2) {
                    d[i][j] = 2;
                } else if (s.charAt(i) == s.charAt(j)) {
                    d[i][j] = d[i + 1][j - 1] + 2;
                } else {
                    d[i][j] = Math.max(d[i][j - 1], d[i + 1][j]);
                }
            }
        }
        return d[0][n - 1];
    }
}
