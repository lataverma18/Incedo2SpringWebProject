package com.lata.springcoredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MyMain {
	public static void main(String[] args) {
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//BeanFactory bf=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		//ApplicationContext bf= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext bf=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee emp=bf.getBean(Employee.class);
		System.out.println(emp);
		emp.greet();
		emp.greet();
	}
}
