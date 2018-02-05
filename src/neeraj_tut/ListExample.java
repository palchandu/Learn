package neeraj_tut;

import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		list.remove("Two");
		ListIterator litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
	}

}
