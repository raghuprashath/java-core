package com.learning.core.day7;

import java.util.Stack;

import java.util.*;

public class D07P04 
{
	public static int evaluate(String expression)
	{
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) 
        {
            char c = expression.charAt(i);
            if (Character.isDigit(c))
            {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i)))
                {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.push(num);
            } 
            else if (c == '+' || c == '-' || c == '*' || c == '/') 
            {
                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) 
                {
                    int b = numbers.pop();
                    int a = numbers.pop();
                    numbers.push(arithmeticOperation(operators.pop(), a, b));
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) 
        {
            int b = numbers.pop();
            int a = numbers.pop();
            numbers.push(arithmeticOperation(operators.pop(), a, b));
        }

        return numbers.pop();
    }

    private static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')') 
        	{
        	return false;
        	}
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
        	return false;
        	
        	}
        return true;
    }

    private static int arithmeticOperation(char operator, int a, int b)
    {
        switch (operator) 
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                	System.out.println("Cannot divide by Zero");
                }
                return a / b;
        }
        return 0;
    }

    
    public static void main(String[] args)
    {	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Expression:");
    	String expression = sc.next();
        int res = evaluate(expression);
        System.out.println(res);
    }
}