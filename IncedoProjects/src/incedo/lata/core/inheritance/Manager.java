package incedo.lata.core.inheritance;

import P1.Employee;

public class Manager extends Employee{
	private String department;
	int shared=200;

	Manager()
	{
		super(101,"Ronit");
		super.foo();
		System.out.println("Manager is constructed!!!");
	}
	
	@Override
	public void salaryDivision()
	{
		System.out.println("Salary Division parameters according to Manager");
	}
	public static void foo()
	{
		System.out.println("foo of Manager");
	}
	void recallSalaryDivision()
	{
		super.salaryDivision();
		System.out.println(super.shared);
	}
	
	Manager(int id,String name,String dept)
	{
		super(id,name);
		System.out.println("");
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
