package com.learning.core.day3;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class D03P11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        String[] s = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        
        System.out.print("Enter string to match: ");
        String z = scanner.next();
        String pattern = "^(.)(.)(\\2)$";

        find(s, pattern);

    }

    public static void find(String[] inputs, String patternString) {
        Pattern pattern = Pattern.compile(patternString);

        for (String s : inputs) {
            Matcher x = pattern.matcher(s);
            if (x.matches()) {
                System.out.println(s);
            }
        }
    }
}