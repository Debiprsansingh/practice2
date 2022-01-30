package com.durgsoft.javaselenium;

import java.util.Scanner;



public class DebuggingDemo
{
	public int m1()
	{
		int sum=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of the array : ");
		  int size=sc.nextInt();
		  System.out.println("enter the array elements");
		  int [] a= new int [size];		
		  for(int i=0;i<a.length; i++)
		  {
			a[i]=sc.nextInt();
			System.out.println("a["+ i + "]="  + a[i] );
			sum=sum+a[i];
			
			
			
		  }
		 // System.out.println( "the sum of the array is :  " +sum);
		  return sum;
						 
	}
	public static void main(String[] args) 
	{
		DebuggingDemo d=new DebuggingDemo();
		int count =d.m1();
		System.out.println(count);
	
	}

}
