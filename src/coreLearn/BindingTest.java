package coreLearn;

public class BindingTest {

	public static void main(String[] args) {
		System.out.println("Creating 3 object of A family");
		A x=new A();
		A y=new B();
		C z=new C();
		x.display();
		y.display();
		z.display();
		y.display("Hello");
		
		A.invoke(x);
		A.invoke(y);
		A.invoke(z);
	}

}
