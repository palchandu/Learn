package coreLearn;

public class Test {
	static int i=10;
	public static void main(String[] args) {
		//System.out.println(i);
		Test t=new Test();
		System.out.println(t.i);
		System.out.println(Test.i);
		t.methodOne();
	}
  public void methodOne()
  {
	  System.out.println(i);
  }
}
