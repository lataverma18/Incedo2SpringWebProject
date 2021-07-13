
public class Employee {
	
	//State, Data members or Fields
	private static String trainingTopic;
	//instance variables
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private static Employee emp;
	
	static
	{
		System.out.println("Static Initializer");
		trainingTopic="J2EE";
	}
	
	public static String getTrainingTopic() {
		return trainingTopic;
	}


	public static void setTrainingTopic(String trainingTopic) {
		Employee.trainingTopic = trainingTopic;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	//Behaviour and member functions 
	
	//Constructor Overloading
	
	Employee()		//default
	{
		System.out.println("Important task for every object");
	}
	
	Employee(int employeeId ,String employeeName,double employeeSalary)		//Parameterized Constructor
	{
		this();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}

	//this keyword -holds the current object  ,this=employee-->this=employee1
	void displayDetails()
	{
		System.out.println(employeeId+"\t"+employeeName+"\t"+employeeSalary+"\t"+trainingTopic);
	}
	
	//Factory Pattern
	public static Employee getEmpObject()
	{
		
		if(emp==null)
		{
			emp=new Employee();
			return emp;
		}
		else
			return emp;
	}
}
