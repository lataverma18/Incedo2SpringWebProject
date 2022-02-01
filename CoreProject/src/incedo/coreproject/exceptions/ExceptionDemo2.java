package incedo.coreproject.exceptions;

import java.io.IOException;

public class ExceptionDemo2 {

	static void get(int a,int b) throws IOException
	{
		int c=a/b;
		throw new IOException();
	}
	public static void main(String[] args) throws IOException {
		/*try
		{*/

		try
		{
			System.exit(0);
			get(2,1);
		}
		/*catch(IOException ae)
		{
			System.out.println(ae.getMessage());	
		}*/
			finally
			{
				System.out.println("Clean up Operations");
			}
	}
}
