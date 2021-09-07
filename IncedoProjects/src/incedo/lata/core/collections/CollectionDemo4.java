package incedo.lata.core.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionDemo4 {

	public static void main(String[] args) {
	Map m=new HashMap();  //Thread Safe
	m.put(103, "Rahil");
	m.put(null, "Ronit");
	m.put(101, "Leela");
	m.put(null, "Ronit Sharma");
	m.put(101, "Leela Sharma");
	
	Set s=m.keySet();
	Collection c=m.values();
	
	Iterator it=s.iterator();
	while(it.hasNext())
	{
		Object obj=it.next();
		System.out.println(obj+"\t"+m.get(obj));
	}
	
	Iterator it1=c.iterator();
	while(it1.hasNext())
		System.out.println(it1.next());
	
	for(Object temp:s)
	{
		System.out.println(temp+"\t"+m.get(temp));
	}
	
	System.out.println(m);
	
	System.out.println(m.containsKey(11));
	System.out.println(m.containsValue("Ronit"));
	}
}
