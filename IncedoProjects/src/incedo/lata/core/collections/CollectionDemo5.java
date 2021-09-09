package incedo.lata.core.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import P1.Employee;

public class CollectionDemo5 {
static List<Employee> filterName(List<Employee> input, int len)
{
	return input.stream().filter(obj->obj.getEmpName().length()>len).collect(Collectors.toList());
}
	
	public static void main(String[] args) {
		List<Employee> arr1=new ArrayList<>();
		arr1.add(new Employee(101,"Ronit"));
		arr1.add(new Employee(105,"Rohit"));
		arr1.add(new Employee(104,"Rita"));
		arr1.add(new Employee(103,"Geeta"));
		arr1.add(new Employee(102,"Neha"));
		
		Collections.sort(arr1,new IdComp());  //obj1.compareTo(obj2)		
		for(Employee temp:arr1)
		{
			System.out.println(temp.getEmpName());
		}
			
		
		filterName(arr1, 4).forEach(obj->System.out.println(obj));
		/*System.out.println(arr);
	
		arr.stream().filter(obj->((Employee)obj).getEmpId()>103).forEach(id->System.out.println(id));
		
		arr.stream().map(obj->((Employee)obj).getEmpName()).forEach(name->System.out.println(name));*/
		
		/*
		List arr2=new ArrayList();
		arr2.add(new Employee(101,"Ronit"));
		arr2.add(new Employee(105,"Rohit"));
		arr2.add(new Employee(104,"Rita"));
		arr2.add(new Employee(103,"Geeta"));
		arr2.add(new Employee(102,"Neha"));
		Collections.sort(arr2,new NameComp());
		
		arr2.forEach(obj->System.out.println(obj));
*/	}
}
