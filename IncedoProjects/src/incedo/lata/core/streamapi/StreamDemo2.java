package incedo.lata.core.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		Employee []arr=new Employee[5];
		
		arr[0]=new Employee(101,"Ronit",67000,"Prod");
		arr[1]=new Employee(103,"Rita",47000,"QA");
		arr[2]=new Employee(105,"Ronit",67000,"Prod");
		arr[3]=new Employee(104,"Neeta",52000,"QA");
		arr[4]=new Employee(102,"Rohit",56000,"Prod");
		
		Arrays.stream(arr).map(obj->obj.getEmpId()).forEach(id->System.out.println(id));
		Arrays.stream(arr).map(obj->obj.getDepartment()).distinct().forEach(dept->System.out.println(dept));
		
		Arrays.stream(arr).filter(obj->obj.getSalary()>=55000).forEach(emp->System.out.println(emp));
		
		System.out.println(Arrays.stream(arr).collect(Collectors.groupingBy(obj->((Employee)obj).getDepartment(),Collectors.counting())));
		System.out.println(Arrays.stream(arr).collect(Collectors.groupingBy(obj->((Employee)obj).getDepartment(),Collectors.summingInt(obj->((Employee)obj).getSalary()))));
		System.out.println(Arrays.stream(arr).map(obj->obj.getEmpName()).collect(Collectors.joining(",")));
	}
}
