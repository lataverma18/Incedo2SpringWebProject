package com.springcore.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.springcore.beans.Employee;

public class MyMain {
	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		AbstractApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
		bf.registerShutdownHook();
		Employee emp1=(Employee)bf.getBean("emp1");
		emp1.greet();
		System.out.println(emp1);
		Employee emp2=bf.getBean(Employee.class);
		System.out.println(emp2);
	}
}
