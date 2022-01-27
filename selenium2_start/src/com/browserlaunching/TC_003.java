package com.browserlaunching;



public class TC_003 extends BaseTest{
	
	public static void main(String[] args) throws Exception 
	{
		initiate();
		launch("firefoxbrowser");
		navigateUrl("iciciUrl");
	}


}
