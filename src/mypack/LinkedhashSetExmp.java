package mypack;
import java.util.*;
public class LinkedhashSetExmp {

	public static void main(String []args)
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("A");
		System.out.println(h);
	}
}
