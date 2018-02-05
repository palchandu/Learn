package mypack;
import java.util.*;
public class HashSetExmp {

	public static void main(String []args)
	{
		HashSet h=new HashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("A");
		System.out.println(h);
	}
}
