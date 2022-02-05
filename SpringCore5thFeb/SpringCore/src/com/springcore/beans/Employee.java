package com.springcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;
@Component("emp1")
public class Employee implements InitializingBean,DisposableBean
{
	private int empId;
	private String empName;
	private Address address;

	public Employee() {System.out.println("Employee Constructor!!!");}
	
	/*public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}*/

	public int getEmpId() {
		return empId;
	}
	@Value("101")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	@Value("Ronit")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void greet()
	{
		System.out.println("Hello!!!, Welcome to Incedo!!!");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean: destroy method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		/*empId=101;
		empName="Ronit";*/
		System.out.println("Initializing Bean : After Properties are Set");
	}
	@PostConstruct
	public void myInitMethod()
	{
		System.out.println("MyInit Method!!!");
	}
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("My Destroy method");
	}
}
