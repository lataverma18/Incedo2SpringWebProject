package incedo.lata.core.collections;

import java.util.LinkedList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(10);
		ll.add(true);
		ll.add("JKL");
		
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));

		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		
		
	}
}
