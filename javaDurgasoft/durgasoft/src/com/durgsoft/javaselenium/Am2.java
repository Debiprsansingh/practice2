package com.durgsoft.javaselenium;

 public class Am2 extends Am1
{
	public void m3()
	{
		System.out.println("the method of m3");
	}
	public void m4()
	{
		System.out.println("the method of m4");
	}

	public static void main(String[] args) 
	{
		Am2 obj = new Am2();
		obj.m1();
		System.out.println(obj.x);
		Am1 o2=new Am1();
		System.out.println(o2.x);
		o2.m1();
		

	}

}
