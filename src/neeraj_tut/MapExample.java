package neeraj_tut;
import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		TreeMap map2=new TreeMap();
		map.put("India", "New Delhi");
		map.put("Bangladesh","Dhaka");
		map.put("China", "Bejieng");
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter country name to find it's capital,end to terminate");
			String key=in.nextLine();
			if(key.equalsIgnoreCase("end"))
				break;
			String value=(String)map.get(key);
			if(value==null)
			System.out.println("The country is not in our map");
			else
				System.out.println("Capital is :"+value);
		}
		System.out.println("we have following entry in map");
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"\n"+m.getValue());
		}
	}

}
