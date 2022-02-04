package incedo.coreproject.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo1 {

	public static void main(String[] args) {
			Configuration conf=new Configuration();
			
			SessionFactory sf=conf.configure("hibernate.conf.xml").buildSessionFactory();
			Session s=sf.openSession();
		
			Transaction t=s.beginTransaction();
			/*Employee emp=new Employee();
			emp.setEmpId(101);
			emp.setEmpName("Ronit Sharma");
			emp.setEmpSalary(55000);*/
				Employee emp=new Employee();
				//emp.setEmpId(101);
				emp.setEmpName("Ronit");
				emp.setEmpSalary(45000);
				
				s.save(emp);
				System.out.println("Employee Stored Successfully!!!");
				//emp.setEmpSalary(50000);
			
			/*Employee e=s.find(Employee.class,101);
			System.out.println(e);*/
			/*s.update(emp);
			System.out.println("Record updated successfully!!!");
*/
			/*Employee emp=s.find(Employee.class,101);
			if(emp!=null)
			{
				s.delete(emp);
				System.out.println("Record deleted successfully!!!");
			}
			else
				System.out.println("Record is not deleted successfully!!!");
			*/
			t.commit();
			s.close();
			sf.close();
	}
}
