package incedo.lata.demos.inheritance;

public class Manager extends Employee {
	private String dept;
	
	

	public Manager(int id, String name, double salary, Address address, String dept) {
		super(id, name, salary, address);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}
	
	static void trythis()
	{
		System.out.println("Static method for Manager!!!");
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println(getId()+"\t"+getName()+"\t"+getSalary()+"\t"+getAddress()+"\t"+dept);
	}
}
