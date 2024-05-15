package com.demo.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenricCatchBlock {

	public static void main(String[] args) {
		System.out.println("opened the connections");
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter no 1");
			int n1=sc.nextInt();
			
			System.out.println("enter no 2");
			int n2=sc.nextInt();
			
			int div=n1/n2;
			System.out.println(div);
			
		}
			
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			
			
		//genric catch block
			// it will be written at last of all catch block
			 //and if not any exception will be generic catch block will work 
		
		catch(Exception e)
		{
			System.out.println("worng input "+e.getMessage());
		}
		
		finally
		{
			sc.close();
			System.out.println("close the connetions ");
		}
	}	
	

}
