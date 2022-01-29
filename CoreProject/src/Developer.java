
public class Developer extends Emp{
	public int i=20;
	private String technology;

	public String getTechnology() {
		return technology;
	}

	
	@Override
	public void displayDetails()
	{
		System.out.println(i+"\t"+getEmpId()+"\t"+getEmpName()+"\t"+getEmpSalary()+"\t"+technology);
	}
	//Method Hiding
	public static void abc()
	{
		System.out.println("static method of Developer");
	}
	public void oldDisplay()
	{
		System.out.println("Old Method");
		super.displayDetails();	
		System.out.println(super.i);
	}
	
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	Developer()
	{
		super(9);
		System.out.println("Developer class Constructor");
	}
	Developer(int i)
	{
		super(i);
		System.out.println("Developer class Constructor");
	}
}


