
public class Demo2 {

	public static void main(String[] args) {
		final int i;
		i=10;
		//System.out.println(i++);
		Employee emp=new Employee();
	
		emp.setEmpId(101);
		emp.setEmpName("Ronit");
		emp.setEmpSalary(45000);
		emp.setCompanyName("ABC Pvt.Ltd.");
		Address ad=new Address("E-1405","Delhi","Delhi/NCR",110011);
		emp.setAddress(ad);
		/*System.out.println(emp.hashCode());
		emp.setEmpSalary(56000);
		System.out.println(emp.hashCode());
		System.out.println(emp);*/
		
		//System.out.println(emp.toString());
		System.out.println(emp);
		
		
		Employee emp1=new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Ronit");
		emp1.setEmpSalary(45000);
		emp1.setCompanyName("ABC Pvt.Ltd.");
		Address ad1=new Address("E-1405","Delhi","Delhi/NCR",110011);
		emp1.setAddress(ad1);
		
		System.out.println(emp.equals(emp1));
		
		
		System.out.println(emp.getClass());
		System.out.println(emp.hashCode());
		System.out.println(emp1.hashCode());
		
		emp1=null;
		emp=null;
		System.gc();
}
}
