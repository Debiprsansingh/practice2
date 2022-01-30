package com.durgsoft.javaselenium;

public class SecondClass 
{
	int x=10,y=2,result;
	public void add()
	{
		result=x+y;
		System.out.println("the addition is "+result);
	}
	public void sub()
	{
		result=x-y;
		System.out.println("sub is "+result);
	}
	public void mul()
	{
		result=x*y;
		System.out.println("multiplication is "+result);
		
	}
	public void div()
	{
		result=x/y;
		System.out.println("div is "+result);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("hello");
		//int x= 20; here 20 is the value which is stored in the reference variable of int type so similarly the 
		//the the below class object is created
    SecondClass obj = new SecondClass();
	obj.add();
	obj.mul();
	obj.sub();
	obj.div();
	// likewise we can create n no of obj for a single class
	SecondClass obj2 = new SecondClass();
	obj2.add();
	obj2.sub();
	obj.mul();
	obj2.div();
	
	
	}

}
