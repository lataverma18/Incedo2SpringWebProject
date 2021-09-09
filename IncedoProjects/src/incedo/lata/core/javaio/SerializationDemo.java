package incedo.lata.core.javaio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*FileOutputStream fos=new FileOutputStream("emps.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Emp emp1=new Emp(101,"Ronit",68000);
		
		oos.writeObject(emp1);
		System.out.println("Object is serialized!!!");*/
		
		FileInputStream fin=new FileInputStream("emps.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Emp e=(Emp)ois.readObject();
		System.out.println(e);
		
	}
}
