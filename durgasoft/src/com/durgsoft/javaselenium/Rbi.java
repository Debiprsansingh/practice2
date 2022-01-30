package com.durgsoft.javaselenium;

public interface Rbi 
{
	public void withdraw();
	public void deposit();
	
	
	public static void main(String[] args) {
		 //Rbi j= new Rbi(); we can not create obj for interface class
			
		Rbi j;// here we create the reference variable for interface class
		j=new ICICI();// WE CRETE THE OBJECT FOR ICICI CLASS AND BELOW IS HDFC CLASS
		j.deposit();
		j.withdraw();
		
		j=new HDFC();
		j.deposit();
		j.withdraw();
		//here the reference variable for interface class is holding the object of multiple class 
		// this is called polymerphism holding many value
	ICICI n =new ICICI();
	n.deposit();
	n.ministatement();// here the Rbi2 interface ministatment  Method got accessed because that method is 
	//used in ICICI class so that we create here one object for ICICI and call that Method
		
	}
}
