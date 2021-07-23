package com.lata.springcoredemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean, DisposableBean{
	private int id;
	private String name;
	private Address address;

	
	public Employee(int id,String name) {
		System.out.println("Constructor Calling...");
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	void greet()
	{
		System.out.println("Welcome to Incedo!!!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying..Employee");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Setting the properties");
		
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("MyInit Method");
	}
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("MyDestroy Method");
	}
}
