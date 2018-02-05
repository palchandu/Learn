package coreLearn;

public class Divider {

	public static int divider(int x,int y) throws ArithmeticException
	{
		try{
		int z=x/y;
		System.out.println("Returning result");
		return z;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is caught in divide(),throwing it back to the main()...");
			throw(e);
		}
		finally
		{
			System.out.println("Final of divider is executed");
		}
	}
	public static void main(String[] args) {
		try{
		int a=12;
		int b=4;
		int c=divider(a,b);
		System.out.println("Result is "+c);
		}
		catch(Exception e)
		{
			System.out.println("Following exception caught in main()");
			System.out.println(e);
		}
	}

}
