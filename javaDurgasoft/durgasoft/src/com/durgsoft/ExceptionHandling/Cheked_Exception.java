
package com.durgsoft.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Cheked_Exception 
{
	public static  void m1() throws FileNotFoundException {
		BufferedReader b= new BufferedReader(new FileReader("d://xyz.abc"));
	}
	public static void main(String[] args) throws Exception 
	{
		m1();
	}
}
