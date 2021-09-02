package P1;

//Java Bean or POJO(Plain Old Java Object)

public class Employee {
	private int empId;
	private String empName;
	private static String ttopic;
	public int shared=100;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(){System.out.println("Default constructor of Employee");}
	static
	{
		ttopic="Core Java";
	}
	
	public void salaryDivision()
	{
		System.out.println("All the basic Salary Division parameters");
	}
	public Employee(int empId, String empName) {
		this();
		this.empId = empId;
		this.empName = empName;
	}
	public String toString()
	{
		return empId+"\t"+empName+"\t"+ttopic+"\t"+address;
	}
	//getters And setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public static void foo()
	{
		System.out.println("foo");
	}
	
}
