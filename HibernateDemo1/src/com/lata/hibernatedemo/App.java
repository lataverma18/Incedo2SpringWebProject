package com.lata.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Configuration cfg=new Configuration();
    SessionFactory sf=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
    
    Employee emp=new Employee(); //Transient State
    emp.setEname("Rita");
    emp.setEsalary(28000);
    
    Employee emp1=new Employee();
    emp1.setEname("Geeta");
    emp1.setEsalary(43000);
    
    Session session=sf.openSession();
    Transaction t=session.beginTransaction();
   
    session.save(emp);					//Persistence State
    
    session.save(emp1);
    
  /*  Employee emp=session.get(Employee.class,101);
    
    System.out.println(emp.getEid()+"\t"+emp.getEname()+"\t"+emp.getEsalary());
  */  
    
     emp.setEsalary(40000);
     t.commit();
     session.close();
     sf.close();
    }
}
