package coreLearn;

public class SimpleGeneric<U,V> {
	private U objU;
	private V objV;
	
	public SimpleGeneric(U param1,V param2)
	{
		this.objU=param1;
		this.objV=param2;
	}
	
	
	public void printType()
	{
		System.out.println("Type U:"+objU.getClass().getName());
		System.out.println("Type V:"+objV.getClass().getName());
	}

}
