package mypack;
import java.util.*;
public class CollectionsExmple {

	public static void main(String []args)
	{
		Vector v=new Vector();
		v.add(10);
		v.add(40);
		v.add(20);
		v.add(25);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
	}
}
