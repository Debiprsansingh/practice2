 package com.durgsoft.javaselenium;

import java.util.Scanner;



public class SingleArray 
{
	
	

	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		int [] a=new int [size];
		System.out.println("enter the elements :");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+ i+ "]=" + a[i]);
			sum=sum+a[i];
		
		
		}	
		
		System.out.println("the addition of the array is " + sum);

		
		}
		
	}




