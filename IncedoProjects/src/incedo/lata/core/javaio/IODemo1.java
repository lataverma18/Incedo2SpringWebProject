package incedo.lata.core.javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IODemo1 {

	public static void main(String[] args) throws IOException {
		
		/*int i=is.read();
		while(i!=-1)
		{
			System.out.println((char)i);
			i=is.read();
		}*/
		
		//BufferedReader---readLine()
		
		



BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
System.out.println(str);

int i=Integer.parseInt(str);
System.out.println(++i);

		
	}
}
