package com.demo.exceptionhandeling;

import java.util.Scanner;

public class AutoCloseBlock {

	public static void main(String[] args) {
		NoMatchException x =new NoMatchException("sudarshanH");
		
		// here i have made an auto closeable block for scanner i.e; s.close();
		try(Scanner s=new Scanner(System.in);){
			
		
		
		System.out.println("enter name to match");
		String name=s.next();
		
		if(name.equals("sudarshanH"))
		{ System.out.println("Name Matched");
		}
		else
		{
			throw new NoMatchException(x.getMessage());
		}
	}catch(NoMatchException a)
		{
		System.out.println("name not match");
		a.printStackTrace();
		}
}
}
	

