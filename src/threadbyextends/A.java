package threadbyextends;

public class A extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I="+i+" A Thread");
		try
		{
			Thread.sleep(5000);
			System.out.println("Thread is sleping");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
