package incedo.coreproject.iodemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IODemo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Employee emp1=new Employee(101,"Ronit",45000);
	/*	Employee emp1=new Employee(101,"Ronit",45000,"Prod","12334");
		FileOutputStream fos=new FileOutputStream("employees.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object Serialized successfully!!!");
		*/
		FileInputStream fis=new FileInputStream("employees.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee.setCompanyName("NULL");
		Employee e=(Employee)ois.readObject();
		System.out.println(e);
		System.out.println("Object DeSerialized successfully!!!");
	}
}
