package com.durgsoft.javaselenium;

public class HDFC implements Rbi,Rbi2
{
	
	public static void main(String[] args) {
		HDFC i2=new HDFC();
		i2.deposit();
		i2.withdraw();
		i2.ministatement();
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("HDFC WITHDRAW");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC DEPOSIT");
		
	}

	@Override
	public void ministatement() {
		// TODO Auto-generated method stub
		System.out.println("ministatment executed");
		
		
	}

	

	

}
