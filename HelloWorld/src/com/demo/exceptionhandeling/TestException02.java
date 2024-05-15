package com.demo.exceptionhandeling;

public class TestException02 {

	public static void main(String[] args) throws Exception 
{
		
		int arr[]= {1,2,3,4,5,6};
		
//		System.out.println(arr[0]);
//		try 
//		{
//		System.out.println(arr[8]);
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("array index out of bound");
//		}
//         finally {
//		System.out.println(arr[1]);
//        }
myException();
}
	
	static void myException()throws Exception{
		throw new Exception(" wrong something here");
	}

}
