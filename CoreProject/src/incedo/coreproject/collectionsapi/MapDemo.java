package incedo.coreproject.collectionsapi;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.Hashtable;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
			Map m=new TreeMap();
			m.put(101,"A");
			m.put(01,"B");
			m.put(80,"C");
			m.put(102,"M");
			m.put(90,"C");
			m.put(101,"L");
			
			System.out.println("***********");
			filterEntries(m,100).forEach((k,v)->System.out.println(k+"\t"+v));
			System.out.println("***********");
			
			
			
			m.forEach((k,v)->System.out.println(k+"\t"+v));
			
			System.out.println(m);
			
			System.out.println(m.get(102));
			Set s=m.keySet();
			System.out.println(s);
			
			System.out.println("----------------");
			Iterator it=s.iterator();
			while(it.hasNext())
			{
				Object key=it.next();
				System.out.println(key+"\t"+m.get(key));
			}
			System.out.println("----------------");
			
			Collection c=m.values();
			System.out.println(c);
			
			Set es=m.entrySet();
			for(Object temp:es)
			{
				Entry e=(Entry)temp;
				System.out.println(e.getKey()+"\t"+e.getValue());
			}
	
			
			System.out.println(m.containsKey(101));
			System.out.println(m.containsValue("L"));
			
			System.out.println(m.remove(101));
			System.out.println(m);
		
	}
	static Map filterEntries(Map m1,int target)
	{
		return (Map)m1.entrySet().stream().filter(obj->((int)((Entry)obj).getKey())>target).collect(Collectors.toMap(k->((Entry)k).getKey(), v->((Entry)v).getValue()));
	}
}
