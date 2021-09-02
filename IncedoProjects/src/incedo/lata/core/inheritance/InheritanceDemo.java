package incedo.lata.core.inheritance;

import P1.Address;
import P1.Employee;

public class InheritanceDemo {

	public static void main(String[] args) {
		Employee emp=new Manager();			//Dynamic Binding 
		
		emp.salaryDivision();			//Dynamic Method Dispatching
		emp.foo();
		Address a=new Address();
		a.setAddress("E-890/43");
		a.setCity("Delhi");
		a.setState("Delhi/NCR");
		a.setZipcode(120200);
		emp.setAddress(a);
		
		System.out.println(emp);
		
		System.out.println(emp.shared);
		//Manager.foo();
	}
}
