package com.durgsoft.javaselenium;

public class InheritanceB extends InheritanceA
{
	public void m1()
	{
		System.out.println("overridden m1 method in classB");
	}
	public void m2()
	{
		System.out.println("m2 method in inheritanceB class");
	}
	public static void main(String[] args) {
		InheritanceB l = new InheritanceB();
		l.m2();
		l.m1();
		InheritanceB t;
		 t=new InheritanceB();
		 t.m1();
		
	}

}
