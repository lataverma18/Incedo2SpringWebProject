package incedo.coreproject.collectionsapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(45);
		arr.add(90);
		arr.add(40);
		arr.add(55);
		arr.add(15);
		
		arr.forEach(obj->System.out.println(obj));
		
		Collections.sort(arr);
		System.out.println(Collections.binarySearch(arr,20));
		
		for(Object temp: arr)
			System.out.println(temp);
		System.out.println("-----------------------");
		
		Iterator it=arr.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("-----------------------");
		//arr.add(3, true);
		
		System.out.println(arr);
		System.out.println(arr.contains(49));
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		/*System.out.println(arr.peekFirst());
		System.out.println(arr.peekLast());
		System.out.println(arr);
		
		System.out.println(arr.pollFirst());
		System.out.println(arr.pollLast());
		System.out.println(arr);*/
		
		//System.out.println(arr.get(1));
		filterValues(arr, 50).forEach(obj->System.out.println(obj));
		/*arr.clear();
		System.out.println(arr.size());*/
		
	}
	static List filterValues(ArrayList ar,int target)
	{
		return (List)(ar.stream().filter(obj->((int)obj)>target).collect(Collectors.toList()));
	}
}
