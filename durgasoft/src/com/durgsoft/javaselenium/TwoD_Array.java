package com.durgsoft.javaselenium;

public class TwoD_Array 
{
	
	
	
	public static void main(String[] args) 
	
	{
		int [][] a= 
	{
		{10,20,30},
		{40,50},
		{70,80,90,100},
		{10}
		
		
	};
		
		
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] + " "  );
			}
			System.out.println("   ");
		}
		
	}
}
