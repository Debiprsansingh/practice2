package com.durgsoft.ExceptionHandling;

import java.util.Scanner;

public class Throw_Exception extends Exception {
	public Throw_Exception(String s) {
		super(s);
	}
	public static void main(String[] args) 
	{
		String str;
		Scanner sc =new Scanner(System.in);
		
		while (true) 
		{
			System.out.println("enter the value of the string");// it is added here so that once the if statement is false again it will again
			//the data
			str=sc.next();
			try {
				if (str.length() != 10)

					throw new Throw_Exception("the string is not 10 character length");
				else 
				System.out.println(str);
				break;
			} 
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
			/*
			 * finally { System.out.println("i am final"); }
			 */
		}
		
		
	}

}
