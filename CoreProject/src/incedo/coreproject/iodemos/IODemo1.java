package incedo.coreproject.iodemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IODemo1 {

	public static void main(String[] args) throws IOException {
		
		/*int i1;
		while((i1=ins.read())!=-1)
		{
		System.out.println((char)i1);
		}*/
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		System.out.println(str);
		String str1=br.readLine();
		System.out.println(str1);
		System.out.println("End of the stream");	
	}
}
