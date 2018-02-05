package mypack;
import java.util.*;
public class ListItr {

	public static void main(String []args)
	{
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("A"))
				itr.add("Z");
			else if(s.equals("B"))
				itr.add("Y");
			else if(s.equals("C"))
				itr.add("X");
			else if(s.equals("D"))
				itr.remove();
		}
		System.out.println(l);
	}
}
