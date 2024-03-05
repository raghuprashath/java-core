package com.learning.core.day3;
public class D03P07{

    public static void main(String[] args) {
        String input = "abc";
        printSubsequences(input);
    }

    public static void printSubsequences(String input) {
        printSubsequencesHelper(input, "", 0);
    }

    private static void printSubsequencesHelper(String input, String current, int index) {
        int n = input.length();

        if (index == n) {
            System.out.print(current+" ");
            return;
        }

        printSubsequencesHelper(input, current + input.charAt(index), index + 1);
        printSubsequencesHelper(input, current, index + 1);
    }
}
