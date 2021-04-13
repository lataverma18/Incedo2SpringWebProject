package com.respo;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;
public class EmployeeRepository {
	List<Employee> emps=null;
	public EmployeeRepository()
	{
		emps=new ArrayList<Employee>();
		emps.add(new Employee(101,"Ronit",80000));
		emps.add(new Employee(102,"Rohit",70000));
		emps.add(new Employee(103,"Reena",68000));
		emps.add(new Employee(104,"Ramika",78000));
		emps.add(new Employee(105,"Rita",65000));
	}
	public List<Employee> getAllEmployees()
	{
		return emps;
	}
	public Employee getEmp(int id)
	{
		for(Employee temp:emps)
		{
			if(temp.getId()==id)
				return temp;
		}
		return null;
	}
	public String create(Employee emp)
	{
		emps.add(emp);
		return "Added successfully";
	}
	public String updateEmp(Employee emp)
	{
		for(Employee temp:emps)
		{
			if(temp.getId()==emp.getId())
			{
				emps.set(emps.indexOf(temp), emp);
				break;
			}
		}
		return "Updated Successfully";
	}
	public List<Employee> deleteEmp(int id)
	{
		for(Employee temp:emps)
		{
			if(temp.getId()==id)
			{
				emps.remove(temp);
			break;
			}
		}
		return emps;
	}
}
