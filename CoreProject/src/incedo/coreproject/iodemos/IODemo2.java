package incedo.coreproject.iodemos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo2 {

	public static void main(String[] args) throws IOException {
	String str=" Verma";
	FileOutputStream fos=new FileOutputStream("A.txt",true);
	/*byte[] b=str.getBytes();
	for(byte temp:b)
		System.out.println(temp);*/
	
	fos.write(str.getBytes());
	fos.close();
	System.out.println("Data is written Successfully!!!");
		/*FileInputStream fis=new FileInputStream("A.txt");
		//System.out.println(fis.read());
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		String str=br.readLine();
		System.out.println(str);*/
	}
}
