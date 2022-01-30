package com.durgsoft.javaselenium;

public class Student {
	int sno;
	String sname;
	int classname;

	/*
	 * public Student(int sno, String sname) { super(); this.sno=sno;
	 * this.sname=sname; System.out.println(this.sno);
	 * System.out.println(this.sname);
	 * 
	 * }
	 */
	



	public Student(String sname, int classname) {
		super();
		this.sname = sname;
		this.classname = classname;
		/*
		 * System.out.println(sname); System.out.println(classname);
		 */
	}




	
	  @Override public String toString() { return "Student [sname=" + sname +
	  ", classname=" + classname + "]";
	 
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student d=new Student("akash", 12);
		//System.out.println(d);
		Student s1= new Student("akash2",44);
		//System.out.println(s1);
		Student s2= new Student("akash2",44);
		//System.out.println(s2);
		Student s3= new Student("akash2",44);
		//System.out.println(s3);
		Student s4= new Student("akash2",44);
		//System.out.println(s4);
		Student [] st=new Student[5];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		st[4]=d;
		for (Student p:st)
		{
			System.out.println(p);
		}
		
		
		
	}

}
