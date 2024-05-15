package com.demo.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MutliCatchabalock01 {

	public static void main(String[] args) {
		System.out.println("opened the resources");
		Scanner sc=null;
	try
	{
			
		
		sc= new Scanner(System.in);
		
		System.out.println("enter the num1 :  ");
		int n1=sc.nextInt();

		System.out.println("enter the 10num2 :  ");
		int n2=sc.nextInt();
		


	int result=n1/n2;
		System.out.println(result);

		
		
		
		// using pipe the operator handle the multiple exception at a time 
}
	catch(ArithmeticException  | InputMismatchException| NullPointerException e)
{
	System.out.println(e.getMessage());
	//e.printStackTrace();
	
}finally 
    {
		System.out.println("closing the resources");
		sc.close();
	}
}

	
}


