package mypack;
import java.util.*;
public class LinkLst {
	public static void main(String []args)
	{
		LinkedList list=new LinkedList();
		list.addFirst("chandra");
		list.add(1,"Pal");
		list.addLast("Prakash");
		//System.out.println(list.getFirst());
		//System.out.println(list.get(1));
		//System.out.println(list.getLast());
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
