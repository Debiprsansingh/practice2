package com.durgsoft.javaselenium;

public abstract class Abs1 {
	public abstract void m3();
	public void m4()
	{
		System.out.println("i am m4 method of class Abs");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Abs1 o1;
			o1=new Abs1Chi1();
			o1.m4();
			o1.m3();
	} 

}
