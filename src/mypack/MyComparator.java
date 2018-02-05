package mypack;
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Book book1=(Book)o1;
		Book book2=(Book)o2;
		if(book1.getPrice()>book2.getPrice())
		{
			return(-1);
		}
		else
		{
			return(1);
		}
	}
}
