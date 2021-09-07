package incedo.lata.core.streamapi;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String department;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(int empId, String empName, int salary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
}
