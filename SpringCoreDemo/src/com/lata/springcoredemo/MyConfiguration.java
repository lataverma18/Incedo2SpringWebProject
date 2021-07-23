package com.lata.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lata.springcoredemo")
public class MyConfiguration {
	
	@Bean
	public Employee employee()
	{
		Employee emp=new Employee(101,"Ronit");
		emp.setAddress(null);
		return emp;
	}
	
	@Bean
	public Address address()
	{
		return new Address();
	}

}
