package incedo.lata.core.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo3 {

	public static void main(String[] args) {
		Set s=new HashSet(); //UnOrdered		//R & B Tree
		s.add(101);
		s.add(30.5);
		s.add("Lata");
		s.add(true);
		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(s);
		
		for(Object temp:s)
		{
			System.out.println(temp);
		}
	}
}
