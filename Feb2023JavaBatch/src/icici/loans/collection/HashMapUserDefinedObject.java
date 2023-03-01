package icici.loans.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefinedObject 
{

	public static void main(String[] args)
	{
		Emp e1 = new Emp(1, "s1");
		Emp e2 = new Emp(2, "s2");
		Emp e3 = new Emp(3, "s3");
		Emp e4 = new Emp(4, "s4");
		
		HashMap<Integer, Emp> h = new HashMap<Integer, Emp>();
		h.put(e1.eno, e1);
		h.put(e2.eno, e2);
		h.put(e3.eno, e3);
		h.put(e4.eno, e4);
		
		Set<Entry<Integer, Emp>> entries = h.entrySet();
		for(Entry<Integer, Emp> e:entries)
		{
			System.out.println(e.getKey());
			Emp ee = e.getValue();
			System.out.println(ee);
		}

	}

}
