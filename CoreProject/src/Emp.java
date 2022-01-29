
public class Emp {
public int i=10;
private int empId;
private String empName;
private double empSalary;
final void get()
{
	
}

public Emp(int i)
{
	System.out.println("Constructor!!! of Emp");
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

public static void abc()
{
	System.out.println("static method");
}
public void getDetails(int empId,String empName,double empSalary)
{
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
}
 void displayDetails()
{
	System.out.println(empId+"\t"+empName+"\t"+empSalary);
}
}
