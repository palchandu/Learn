package coreLearn;

public class A {

	public void display()
	{
		System.out.println("In A");
	}
	
	public void display(String r)
	{
		System.out.println(r);
	}
	
	public static void invoke(A x)
	{
		x.display();
	}
}
