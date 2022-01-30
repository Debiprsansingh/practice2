package com.durgsoft.javaselenium;

public class ChildClass extends AbstractClass  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass i=new ChildClass();
		System.out.println(i.x);
		i.m1();
		i.m2();

	}
	public void m1()
	{
		System.out.println("i m m1 overridden  method in childclass");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("i m m2 overridden method in child class");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
		
	}

}
