package coreLearn;

import java.util.*;

public class StaticBindingTest {

	public static void main(String args[])  {
	       Collection c = new HashSet();
	       StaticBindingTest et = new StaticBindingTest();
	       et.sort(c);
	      
	    }
	public Collection sort(Collection c){
        System.out.println("Inside Collection sort method");
        return c;
    }
	public Collection sort(HashSet hs){
        System.out.println("Inside HashSet sort method");
        return hs;
    }


}
