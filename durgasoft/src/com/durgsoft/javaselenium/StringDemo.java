package com.durgsoft.javaselenium;

public class StringDemo 
{

	public static void main(String[] args) {
		
	
		/*
		 * String name ="Akash"; String surname="singh"; System.out.println(name);
		 * String s= new String("akash"); System.out.println(s);
		 * System.out.println(s.charAt(3)); System.out.println(s.codePointBefore(2));
		 * System.out.println(s.contentEquals(name));
		 * System.out.println(surname.length());
		 * System.out.println(name.concat(surname));
		 * System.out.println(name.substring(0, 4));
		 * System.out.println(name.indexOf('a'));
		 * System.out.println(name.equals(surname));
		 * System.out.println(name.equalsIgnoreCase(surname));
		 * System.out.println(name.equals(s)); System.out.println(name.toUpperCase());
		 * System.out.println(); String
		 */
	String s2="AKASH SINGH @@@@@@";
	System.out.println(s2);
	String[] st=s2.split(" ");
	
	for(String q:st)
	{
		System.out.println(q);
	}
	 
	}
	
	
}
