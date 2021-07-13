import java.util.Scanner;

public class Executor {
	
	public static void main(String []args)
	{
		//101\n
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id of Employee:");
		int id=sc.nextInt();

		sc.nextLine();
		
		System.out.println("Enter Name of Employee:");
		String name=sc.nextLine();  //delimiter is enter key

		System.out.println("Enter Salary of Employee:");
		double sal=sc.nextDouble();
		
		Employee emp=new Employee(id,name,sal);
		emp.displayDetails();
	}
}
