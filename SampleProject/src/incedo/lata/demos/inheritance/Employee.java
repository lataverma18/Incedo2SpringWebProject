package incedo.lata.demos.inheritance;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;
	
	

	public Employee(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	void displayDetails()
	{
		System.out.println(id+"\t"+name+"\t"+salary+"\t"+address);
	}
	
	public Address getAddress() {
		return address;
	}
	static void trythis()
	{
		System.out.println("static method");
	}
}
