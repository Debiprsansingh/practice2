package com.durgsoft1.javaselenium;

import com.durgsoft.javaselenium.VariableTypes1;

public class VariableTypes2 extends VariableTypes1
{
	//int x=200;// instance global  variable or nonstatic variable
	static String name= "AKASH"; // static global  variable
	//static VariableTypes2 o1;
	
	public void m4()
	{
		
		
		
		//int x=500;// it is a local varibale its scope is with in the method only outside the value cant directly accessed
		System.out.println(x);
		//System.out.println(this.x);// this keyword is used to acceess instance variable
		
	}
/* notes:-
 * static method()
 * {
 * static(method/variable) can be accessed by class name or name
 * instance(variable /method) we need to create an object to access
 * }
 * Instance method()
 * {
 * static(method/variable) can be accessed by class name or name
 * instance(variable /method) we need not to create an object to access directly it can be accessed
 * 
 */
	
	/* public static void m2()
	 {
		o1= new VariableTypes2();
		System.out.println(o1.x);// in instance method instance varible can be directly accessed
		o1.m1();
		System.out.println(name);
		
	 }*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VariableTypes2 o2 = new VariableTypes2();// the refernce variables is local to this method outside cant access
		/*System.out.println(o1.x);
		o1.m1();
		System.out.println(VariableTypes2.name);
		System.out.println(name);*/
		o2.m4();
		
		
	}

}
