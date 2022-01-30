package com.durgsoft.javaselenium;

public class MethodOverloading 
{
	public void m1(int x)

	{
		System.out.println("the is int object method");
	}
	public void m1()
	{
		System.out.println("this is the void object method");
	}
	public void m1(String name)
	{
		System.out.println("this is the string object method");
	}
	public void m1(float f)
	{
		System.out.println("this is the float object method");
	}
	public void m1(String ename ,int age)
	{
		System.out.println(" this string and int type object " + ename + age);
		
	}
	
	  public void m1(Integer x) { System.out.println(x); }
	 
	public void m1(Object Y)// the wrapper class is declared here bt it will find always the primitive data type
	{
		System.out.println(Y);
	}
	public static void main(String[] args) {
		
		MethodOverloading o = new MethodOverloading();
		
		  o.m1(); o.m1(12);	
		  o.m1("akash");
		  o.m1("akash");
		  
		
	}

}
