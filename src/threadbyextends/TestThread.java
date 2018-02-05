package threadbyextends;

public class TestThread {

	public static void main(String[] args) {
		A o1=new A();
		B o2=new B();
		o1.setPriority(6);
		o2.setPriority(4);
		o1.start();
		o2.start();
		

	}

}
