package com.durgsoft1.javaselenium;

import com.durgsoft.javaselenium.Am1;
import com.durgsoft.javaselenium.Am2;

public class Am3 extends Am2
{
public void m5()
{
	System.out.println("the method of m5");
	
}
	public void m6()
	{
		System.out.println("the method of m6");
	}
	public static void main(String[] args)
	{
		
		Am1 o3 = new Am1();
		//o3.m1();
		Am3 o1 = new Am3();
		o1.m1();
		System.out.println(o1.x);
		
	}

}
