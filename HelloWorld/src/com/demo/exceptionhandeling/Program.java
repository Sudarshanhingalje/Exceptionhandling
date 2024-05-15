package com.demo.exceptionhandeling;

import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		System.out.println("opened the resources");
		Scanner sc= new Scanner(System.in);
		//Scanner sc=null;
		System.out.println("num1 :  ");
		int n1=sc.nextInt();

		System.out.println("num2 :  ");
		int n2=sc.nextInt();
		


try
{
		int result=n1/n2;
		System.out.println(result);

		
}catch(ArithmeticException e)
{
	System.out.println(e.getMessage());
	e.printStackTrace();
	
}finally 
    {


		System.out.println("closing the resources");
		sc.close();
	}
	}
}
	
	
		

	

