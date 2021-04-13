package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.respo.EmployeeRepository;

@RestController
public class MyRestController {
	EmployeeRepository employeeRespository=new EmployeeRepository();
	//restservice/employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()  //.../restservice/employees
	{
		return employeeRespository.getAllEmployees();
	}
	//restservice/employee/101
	@GetMapping("employees/{id}")
	public Employee getEmp(@PathVariable("id") int id)
	{
		return employeeRespository.getEmp(id);	
	}
	//restservice/employee/add
	@PostMapping("employees")
	public String createEmp(@RequestBody Employee emp)
	{
		return employeeRespository.create(emp);
	}
	/*public String updteEmp()
	{
		empResp.updateEmp(emp)
	}*/
	//restservice/employee/delete/101
	@DeleteMapping("employees/{id}")
	public List<Employee> deleteEmp(@PathVariable("id") int id)
	{
		return employeeRespository.deleteEmp(id);
	}
}
