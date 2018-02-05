package mypack;
import java.util.*;
public class ComparatorExmp {
	public static void main(String []args)
	{
		Book b1,b2,b3;
		b1=new Book("PHP",300.00);
		b2=new Book("Java",500.00);
		b3=new Book("AngularJs",600.00);
		TreeSet<Book> s=new TreeSet<Book>(new MyComparator());
		s.add(b1);
		s.add(b2);
		s.add(b3);
		Iterator<Book> it=s.iterator();
		Book b;
		while(it.hasNext())
		{
			b=it.next();
			System.out.println(b.getTitle()+" "+b.getPrice());
		}
	}
}
