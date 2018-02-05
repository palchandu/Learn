package mypack;
import java.util.*;
public class ArraysExmpl {

	public static void main(String []args)
	{
		int a[]={10,40,5,25,40};
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		Arrays.sort(a);
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}
