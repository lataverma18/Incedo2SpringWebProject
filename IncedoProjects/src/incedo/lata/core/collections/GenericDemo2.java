package incedo.lata.core.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class A{}
class B extends A{}
class C extends A{}

public class GenericDemo2 {

	static void displayList(List<? super A> list)
	{
		Iterator<?> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public static void main(String[] args) {
		ArrayList<Object> arr =new ArrayList<>();
		arr.add(new A());
		arr.add(new B());
		arr.add(new C());
		
		displayList(arr);
		
		ArrayList<A> arr1=new ArrayList<>();
		displayList(arr1);
		
		ArrayList<B> arr2=new ArrayList<>();
		//displayList(arr2);
		
		ArrayList<C> arr3=new ArrayList<>();
		//displayList(arr3);
	}
}
