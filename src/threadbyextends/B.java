package threadbyextends;

public class B extends Thread {
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println("I="+i+" B Thread");
	}
}
