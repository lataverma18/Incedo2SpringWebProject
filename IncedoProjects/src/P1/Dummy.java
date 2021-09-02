package P1;
import static java.lang.Math.*;

import incedo.lata.core.inheritance.A;
public class Dummy extends A {
	static
	{
		System.out.println("Hello Static Block!!!");
	}

	public static void main(String[] args) {
/*		Dummy a1=new Dummy();
		//a1.get();
		//a1.put();
		a1.set();
		a1.out();
		
		Employee.foo();
		System.out.println(PI);
		System.out.println(pow(2, 3));
		System.out.println(sqrt(2));
		System.out.println(abs(-20));
		System.out.println(max(45,30));
		*/
	System.out.println("Hello World!!!");	
	Employee emp1=new Employee(101,"Ronit");
	Employee emp2=new Employee(102,"Rohit");
	
	emp1.setEmpName("Ronit Sharma");
	System.out.println(emp1);
	System.out.println(emp2);
	}
}
