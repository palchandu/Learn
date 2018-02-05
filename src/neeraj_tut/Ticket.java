package neeraj_tut;

public class Ticket {

	private int no,value;
	private static int counter,amount;
	
	static
	{
		counter=0;
		amount=0;
	}
	
	public Ticket(int v)
	{
		value=v;
		no=++counter;
		amount=amount+value;
	}
	
	public void show()
	{
		System.out.println("It is ticket no."+no+"of Rs."+value);
	}
	
	public static void  summary()
	{
		System.out.println(counter+" ticket of Rs."+amount+" is sold");
	}
}
