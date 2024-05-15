package com.demo.exceptionhandeling;


import java.util.Scanner;

public class Record {

		public static void viewRecord() throws InterruptedException
		{
	int count;
	for(count=1;count<=10;count++)
	{
		System.out.println("show count "+count);
	}
}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			try {
				Record.viewRecord();
			} catch (InterruptedException e) {
				System.out.println("intrupation occur");
				e.printStackTrace();
			}
			
			
			
 
}
}

