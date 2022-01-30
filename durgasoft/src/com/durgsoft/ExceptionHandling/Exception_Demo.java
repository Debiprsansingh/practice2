package com.durgsoft.ExceptionHandling;

import java.util.Scanner;

public class Exception_Demo

{
	public static void main(String[] args)
	{
		
		int nr,dr,result;
		
		Scanner sc =new Scanner(System.in);
		
	
		
		while (true) 
		{
			System.out.println("enter the nr value");
			nr=sc.nextInt();
			System.out.println("enetr the dr value");
			dr=sc.nextInt();
			
			try {
				
				result = nr / dr;
				System.out.println(result);
				
				break;
			} 
		
			catch (ArithmeticException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
	
		
		  
		
		 
	}
	
}



