package com.durgsoft.javaselenium;

public class InheritanceC extends InheritanceA {
	public void m3()
	{
		System.out.println("m3 method in class C");
	}

	public static void main(String[] args) 
	{
		InheritanceC c = new InheritanceC();
		c.m1();
		c.m3();
		

	}

}
