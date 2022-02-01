package incedo.coreproject.iodemos;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private int empId;
	private String empName;
	private int empSalary;
	private String empDept;
	transient private String empPwd;
	static String companyName;
	static
	{
		companyName="ABC Pvt.Ltd";
		
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException
	{
		String ecpwd=new String(Base64.getEncoder().encode(empPwd.getBytes()));
		oos.defaultWriteObject();
		oos.writeObject(ecpwd);
		System.out.println("Called:");
	}
	private void readObject(ObjectInputStream ois) throws Exception
	{
		ois.defaultReadObject();
		String mystoredPwd=(String)ois.readObject();
		empPwd=new String(Base64.getDecoder().decode(mystoredPwd));
		System.out.println(mystoredPwd);
	}
	public Employee(int empId, String empName, int empSalary,String empDept,String empPwd) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept=empDept;
		this.empPwd=empPwd;
	}
	
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary +", empDept=" + empDept +", empPwd=" + empPwd + ", CN=" + companyName + "]";
	}
}
