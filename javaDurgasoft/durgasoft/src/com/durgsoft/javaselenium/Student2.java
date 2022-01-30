package com.durgsoft.javaselenium;

public class Student2 {
int eno;
String ename;
String grade;


	public Student2(int eno, String ename, String grade) 
	{
	super();
	this.eno = eno;
	this.ename = ename;
	this.grade = grade;
}
	


	@Override
	public java.lang.String toString() {
		return "Student2 [eno=" + eno + ", ename=" + ename + ", grade=" + grade + "]";
	}



	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Student2 s = new Student2 (1, "akash", "A");
		System.out.println(s);
		Student2 s1=new Student2(2, "akash1", "A");
		System.out.println(s1);
		Student2 s2= new Student2(3, "akash2","A");
		System.out.println(s2);
		System.out.println("-----------------------------------------------");
		Student2[] st= new Student2[3];
		st[0]=s;
		st[1]=s1;
		st[2]=s2;
		for(Student2 p:st)
		{
			System.out.println(p);
			
		}
		
		
	
		

	}

}
