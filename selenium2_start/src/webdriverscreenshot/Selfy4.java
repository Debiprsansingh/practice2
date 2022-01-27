package webdriverscreenshot;

import java.util.Date;

public class Selfy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt= new Date();
		System.out.println(dt);
		String d= dt.toString().replace(':', '_').replace(' ','_');
		System.out.println(d);
		

	}

}
