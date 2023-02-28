package icici.loans.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("dell");
		a.add("oracle");
		a.add("tcs");
		a.add("arsin");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("arsin"))
				val.set("vmware");
			else
				val.remove();		
		}
		System.out.println(a);
	}

}
