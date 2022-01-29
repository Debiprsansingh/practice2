package pack2;

public class Class1 
{
	int a,b,c;

	public Class1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
	} 
	public void m1()
	{
		c=a+b;
		System.out.println("addition is " + c);
	}
	public static void main(String[] args) {
		Class1 c1 = new Class1(100,200);
		c1.m1();
	}
	

}
