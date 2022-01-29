public class Employee {
	
private int empId;
private String empName;
private double empSalary;
private static String companyName;
private Address address;

public void finalize()
{
	System.out.println("Clean up operation!!!");
}

@Override
public boolean equals(Object o)
{
	Employee e=(Employee)o;
	if(this.getEmpId()==e.getEmpId() && this.getEmpName().equals(e.getEmpName()) && this.getEmpSalary()==e.getEmpSalary() )
		return true;
	else
		return false;
}

public int hashCode()
{
	return empId+(int)empSalary;
}
public String toString()
{
	return empId+"\t"+empName+"\t"+empSalary+"\t"+Employee.companyName+"\t"+address.displayDetails();
}
static
{
	companyName="ABC Pvt.Ltd";
}
static
{
	System.out.println("Hello");
}

public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(int empId,String empName,double empSalary)
{
	this();
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
}

public static String getCompanyName() {
	return companyName;
}

public static void setCompanyName(String companyName) {
	Employee.companyName = companyName;
}

public Employee()
{
	System.out.println("Employee is registered!!!");
}

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

public double getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
static
{
	System.out.println("Hiii");
}
}
