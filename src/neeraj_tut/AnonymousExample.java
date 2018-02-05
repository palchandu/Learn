package neeraj_tut;

public class AnonymousExample {

	int a;
	public AnonymousExample()
	{
		System.out.println("In Default");
		a=5;
	}
	
	public AnonymousExample(int x)
	{
		System.out.println("In Parametrize");
		a=x;
	}
	public void display()
	{
		System.out.println("a="+a);
	}
	{
		System.out.println("common initialization started");
	}
	public static void main(String args[])
	{
		AnonymousExample x=new AnonymousExample();
		x.display();
		AnonymousExample y=new AnonymousExample(20);
		y.display();
	}
	{
		System.out.println("common initialization end");
	}
}
