package incedo.coreproject.labdasandstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIDemo2 {

	public static void main(String[] args) {
		Employee []arr=new Employee[5];
		
		//ArrayList arr=new ArrayList();
		
		arr[0]=new Employee(101,"Ronit",45000,"Prod");
		arr[1]=new Employee(102,"Rohit",35000,"QA");
		arr[2]=new Employee(103,"Neena",42000,"Prod");
		arr[3]=new Employee(104,"Heena",38000,"QA");
		arr[4]=new Employee(105,"Leena",35000,"Testing");

		System.out.println(Arrays.stream(arr).collect(Collectors.groupingBy(obj->obj.getEmpDept(),Collectors.counting())));
		
		System.out.println(Arrays.stream(arr).map(obj->obj.getEmpName()).collect(Collectors.joining("|")));
		
		
	/*	Arrays.stream(arr).forEach(obj->System.out.println(obj));
		//Arrays.stream(arr).map(obj->obj.getEmpId()).forEach(id->System.out.println(id));
		Arrays.stream(arr).forEach(obj->System.out.println(obj.getEmpId()));
		boolean b=Arrays.stream(arr).anyMatch(obj->obj.getEmpDept().equals("Testing"));
		System.out.println(b);
		boolean b1=Arrays.stream(arr).allMatch(obj->obj.getEmpSalary()>40000);
		System.out.println(b1);
		System.out.println(Arrays.stream(arr).filter(obj->obj.getEmpSalary()>40000).count());
		System.out.println("--------------Trial-----------");
		Arrays.stream(arr).map(obj->obj.getEmpDept()).distinct().forEach(obj->System.out.println(obj));
		System.out.println(Arrays.stream(arr).map(obj->obj.getEmpDept()).distinct());
		
		Optional op=Arrays.stream(arr).map(obj->obj.getEmpSalary()).reduce((a,c)->a+c);
		if(op.isPresent())
			System.out.println(op.get());
		
		Optional op1=Arrays.stream(arr).reduce((a,c)->a.getEmpSalary()<c.getEmpSalary()?a:c);
		if(op1.isPresent())
			System.out.println(op1.get());
		else
			System.out.println("No Record Found");
*/		
		
		//Optional emp=arr.stream().findFirst();
		 
		//Arrays.stream(arr).findAny();
		//System.out.println(arr.stream().findFirst().get());
		/*if(emp.isPresent())
			System.out.println(emp.get());
		else
			System.out.println("No First Element!!!");*/
	}
}
