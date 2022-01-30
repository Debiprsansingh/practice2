package com.durgsoft.javaselenium;

public class ICICI implements Rbi,Rbi2
{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		 System.out.println("1000 is withdrawn");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("2000 deposited");
	}
	public static void main(String[] args)
	{
		ICICI i=new ICICI();
		i.deposit();
		i.withdraw();
		i.ministatement();
		
		
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		System.out.println("ministatment executed");
		
	}

}
