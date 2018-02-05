package mypack;
import java.util.*;
public class ArrayLst {
	public static void main(String []args)
	{
	ArrayList l1=new ArrayList(4);
	l1.add("Ajay");
	l1.add("Rahul");
	l1.add(1, "Ramesh");
	Iterator it=l1.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	}
}
