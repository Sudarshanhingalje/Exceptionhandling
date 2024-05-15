package com.demo.exceptionhandeling;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Testexception01 {
	public static float divide(int n1,int n2) {
		try {
		float c=n1/n2;
		return c;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) 
		{
			try {
				System.out.println("enetr number 1");
				int n1=sc.nextInt();
				System.out.println("enetr number 2");
				int n2=sc.nextInt();
				float c=divide(n1,n2);
				System.out.println("The answer : "+c);
				List<Integer> lst=new ArrayList<>();
				lst.add(5);
				lst.add(7);
				break;
			}catch(InputMismatchException|NullPointerException e) {
				System.out.println(e.getMessage());
				System.out.println("pls enter correct no"
						+ "number");
				
			}catch(Exception e){
				System.out.println("error occured, my own exception "+e.getMessage());
				
				
				//exception handel or not finally block always work and it is
				//written after try and catch block 
				//it is mostly used for the closing the connection that we are using 
				
			}finally {
				System.out.println("in finally block");
				sc.close();
			}
		}
		
	}

}
