package incedo.lata.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Collectionzdemo1 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		System.out.println(arr.size());
		arr.add(10);
		arr.add(40);
		arr.add(20);
		arr.add(30);
		arr.add(10);
		
		Collections.sort(arr);

		System.out.println(arr);
		arr.add(2, 'A');
		System.out.println(arr);
		arr.remove("Lata");
		System.out.println(arr);
		arr.remove(new Integer(10));
		System.out.println(arr);
		System.out.println(arr.isEmpty());
		System.out.println(arr.contains(true));
		arr.clear();
		System.out.println(arr);
	}
}
