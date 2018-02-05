package neeraj_tut;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("India");
		hs.add("China");
		hs.add("Nepal");
		hs.add("Bhutan");
		hs.add("Australia");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Adding India again to HashSet");
		if(hs.add("India"))
			System.out.println("Added,duplicate are allowed");
		else
			System.out.println("Not added,duplicate are not allowed");
		System.out.println("Creating a TreeSet and HashSet element to it");
		TreeSet ts=new TreeSet();
		ts.addAll(hs);
		Iterator itr2=ts.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
