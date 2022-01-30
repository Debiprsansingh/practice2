package com.durgsoft.javaselenium;



	public class VariableTypes1 
	{
		protected int x=2000;// instance global  variable or non static variable
		static String name= "AKASH"; // static global  variable
		 static VariableTypes1 o1;
		
		public void m1()
		{
			o1= new VariableTypes1();
			
			
			int x=500;// it is a local variable its scope is with in the method only outside the value cant directly accessed
			System.out.println(x);
			System.out.println(this.x);// this keyword is used to access instance variable
			
		}
	/* notes:-
	 * static method()
	 * {
	 * static(method/variable) can be accessed by class name or name
	 * instance(variable /method) we need to create an object to access
	 * }
	 * Instance method()
	 * {
	 * }
	 * static(method/variable) can be accessed by class name or name
	 * instance(variable /method) we need not to create an object to access directly it can be accessed
	 * 
	 */
		
		 public static void m2()
		 {
			o1= new VariableTypes1();
			System.out.println(o1.x);// in instance method instance varible can be directly accessed
			o1.m1();
			System.out.println(name);
			
		 }
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 o1=new VariableTypes1();// the reference variables is local to this method outside cant access
			System.out.println(o1.x);
			o1.m1();
			System.out.println(VariableTypes1 .name);
			System.out.println(name);
			m2();
			
			
		}

	}


	


