package coreLearn;

public class TestSimpleGeneric {

	public static void main(String[] args) {
		SimpleGeneric<String, String> g=new SimpleGeneric<String,String>("Ram","Shyam");
		g.printType();
	}

}
