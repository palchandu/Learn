package mypack;
import java.util.*;
public class VectorExmp {
	public static void main(String []args)
	{
		Vector v=new Vector();
		v.addElement("1");
		v.addElement("2");
		v.addElement("3");
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			String s=(String) e.nextElement();
			System.out.println(s);
		}
	}
}
