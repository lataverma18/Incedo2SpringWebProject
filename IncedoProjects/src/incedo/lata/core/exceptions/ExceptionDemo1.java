package incedo.lata.core.exceptions;

import java.io.IOException;

public class ExceptionDemo1 {

	static void get(int a,int b) 
	{
		if(b==0)
			throw new NullPointerException();
	}
	public static void main(String[] args) {
		System.out.println("Starting of the Main");
		get(10,0);
		try
		{
			System.exit(0);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Closing Operation");
		}
		System.out.println("Ending of the Main");
	}

}
