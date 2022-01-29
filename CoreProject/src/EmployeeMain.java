import java.util.Scanner;
import static java.lang.Math.*;
public class EmployeeMain {
	static
	{
		System.out.println("Bye");
	}

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Ronit",45000);
		Employee emp2=new Employee(102,"Rohit",42000);
		
		emp1.displayDetails();
		emp2.displayDetails();
		
		System.out.println(sqrt(2));
		System.out.println(pow(2,3));
		System.out.println(PI);
		System.out.println(abs(-2));
		System.out.println(exp(2));
		System.out.println(log(2));
	}
}
