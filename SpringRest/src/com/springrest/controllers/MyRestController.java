package com.springrest.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.model.Employee;

@RestController
public class MyRestController {
	List<Employee> emps= Arrays.asList(new Employee(101,"Ronit",45000),new Employee(102,"Rita",3800),new Employee(103,"Gaurav",35000),new Employee(104,"Rohit",42000),new Employee(105,"Heena",46000));
	
	@GetMapping("/employees")
	public List<Employee> getAllEmp()
	{
		return emps;
	}
	@GetMapping("/employees/{id}")
	public Employee getEmpById(@PathVariable("id") int id)
	{
		Optional<Employee> op=emps.stream().filter(obj->obj.getEmpId()==id).findAny();
		if(op.isPresent())
			return op.get();
		else
			return null;
	}
	@PostMapping("/employees")
	public String insertEmp(@RequestBody Employee emp)
	{
		emps.add(emp);
		return "Inserted Successfully!!!";
	}
	@PutMapping("/employees/{id}")
	public String updateEmp(@RequestBody Employee emp,@PathVariable("id") int id)
	{
		//Logic to update record of emp id -id
		return id+"Updated Successfully!!!";
	}
	@DeleteMapping("/employees/{id}")
	public String deleteEmp(@PathVariable("id") int id)
	{
		//Logic for deleting the Employee type object on the basis of Id
		return "Deleted Successfully!!!";
	}
}
