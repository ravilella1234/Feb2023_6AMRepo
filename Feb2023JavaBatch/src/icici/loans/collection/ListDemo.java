package icici.loans.collection;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("ravikanth");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.get(1));
		System.out.println(a.indexOf("ravikanth"));
		System.out.println(a.contains("ravikanth"));
		a.add(30);
		System.out.println(a);
		System.out.println(a.subList(1, 5));
		
		System.out.println(a);
		a.add(1, "sai");
		System.out.println(a);
		a.set(1, "sairam");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		a.remove("ravikanth");
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}
}
