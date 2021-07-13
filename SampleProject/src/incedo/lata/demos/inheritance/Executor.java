package incedo.lata.demos.inheritance;

public class Executor {

	public static void main(String[] args) {
		Employee emp=new Manager(101,"Ronit",30000,new Address("E-1405/49","FBD","Delhi/NCR",121001),"Prod");
		emp.displayDetails();		//dynamic binding or dynamic method dispatching
		

		
	}
}
