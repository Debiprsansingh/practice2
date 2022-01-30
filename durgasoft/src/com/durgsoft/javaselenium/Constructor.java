package com.durgsoft.javaselenium;

public class Constructor {

	int eno;
	String ename;
	float f;

	Constructor() {
		System.out.println("i am default constructor");
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.f);
		System.out.println("---------default end---------------");
	}
	
	public Constructor(int eno) 
	{
		//this();
		this.eno = eno;
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.f);
		System.out.println("-------------single end----------------");
	}

	
	Constructor(int eno, String ename) 
	{
	  this(eno);
	  this.eno=eno; 
	  this.ename=ename;// this keyword is used to refer the imstance variable for the current class
	  System.out.println(this.eno);
	  System.out.println(this.ename);
	  System.out.println(this.f);
	  System.out.println("--------double end------------");
	 }
	 



	public Constructor(int eno, String ename, float f) {
		//this(eno,ename);
		this(eno,ename);
		this.eno = eno;
		this.ename = ename;
		this.f = f;
		System.out.println(this.ename);
		System.out.println(this.eno);
		System.out.println(this.f);
	}

	public static void main(String[] args) {
		
		Constructor q = new Constructor(123, "akash3");
		//System.out.println("calling ename: " + q.ename);
		

	}

}
