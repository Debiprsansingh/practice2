package com.durgsoft.javaselenium;

public abstract class AbstractClass 
{
	//abstract class contains both concrete and abstract behavior
	 int x= 100;
	 public  void m1()
	 {
		 System.out.println("i am concrete from abstrctclass");
		// inside abstract class while declaring abstract method it is mandatory to put abstract before method name
			 }
	 
	 public abstract void m2();// inside abstract class while declaring abstract method it is 
	 //mandatory to put abstract before method name
	 public abstract void m3();
	

	 public static void main(String[] args) {
		 AbstractClass i;
		 i=new ChildClass();
		 i.m2();
		 i.m1();
		 i.m3();
		 
	
}
	}


