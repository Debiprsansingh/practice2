package selenium_class;

public class Class1 
{
	int a ,b ,c;
	
	
	
	public Class1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void add()
	{
		c=a+b;
		System.out.println("c addition is " + c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("c minus is " + c);
	}
	
	public static void main(String[] args) 
	{
		Class1 o = new Class1(10,5);
		o.add();
		o.sub();
		
	}
	
	
}
