package com.durgsoft.javaselenium;

public class InheritanceE extends InheritanceD
{
	public void m5()
	{
		System.out.println("m5 method in Inheritance5");
	}
	public static void main(String[] args) {
		InheritanceE o = new InheritanceE();
		o.m1();
		o.m4();
		o.m5();
		InheritanceD y = new  InheritanceD();
		y.m1();
		y.m4();
		InheritanceA q = new InheritanceA();
		q.m1();
		

	}

}
