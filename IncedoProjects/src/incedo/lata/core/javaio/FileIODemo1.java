package incedo.lata.core.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo1 {

	public static void main(String[] args) throws IOException {
	/*	FileWriter fw=new FileWriter("A.txt");
		String str="This is my file Content";
		fw.write(str);
		System.out.println("Data Written Successfully");
		fw.close();*/
		
		FileReader fr=new FileReader("A.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println(br.readLine());
		
	}
}
