package incedo.lata.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import P1.Employee;

public class CollectionDemo5 {

	public static void main(String[] args) {
		List arr=new ArrayList();
		arr.add(new Employee(101,"Ronit"));
		arr.add(new Employee(105,"Rohit"));
		arr.add(new Employee(104,"Rita"));
		arr.add(new Employee(103,"Geeta"));
		arr.add(new Employee(102,"Neha"));
		
		Collections.sort(arr);
		
		arr.forEach(obj->System.out.println(obj));
		/*System.out.println(arr);
	
		arr.stream().filter(obj->((Employee)obj).getEmpId()>103).forEach(id->System.out.println(id));
		
		arr.stream().map(obj->((Employee)obj).getEmpName()).forEach(name->System.out.println(name));*/
	}
}
