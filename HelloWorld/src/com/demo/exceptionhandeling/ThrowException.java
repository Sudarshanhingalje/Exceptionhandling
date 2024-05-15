package com.demo.exceptionhandeling;

import java.util.Scanner;

public class ThrowException {
	
	public static void validatePerson(int age)
	{
		
		
		
		// exceplictly we can throw the exception 
		// only object that of throwable class or subclass we can for that we can throw the exception
		if(age<18)
		{
			 ArithmeticException ex = new ArithmeticException();
			 System.out.println("You are not eligible for voating");
			throw ex;
		}
		else {
			  System.out.println("You are eligible for voating");
		     }
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the age of the person to check for voating : ");
		int age = s.nextInt();
		
		validatePerson(age);
		System.out.println(" reamaing code here");
		
		
	 finally {
		     sc.close();
		 }
	}
	
}
	
	
