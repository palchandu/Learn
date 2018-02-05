package coreLearn;

public class GenericMethod {

	public <E> void printArr(E []s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	public static void main(String []args)
	{
		GenericMethod m=new GenericMethod();
		String country[]=new String[]{"India","Nepal","Bhutan","Bangladesh"};
		Integer cntArr[]=new Integer[]{12,34,45,56,78};
		m.printArr(country);
		m.printArr(cntArr);
	}
}
