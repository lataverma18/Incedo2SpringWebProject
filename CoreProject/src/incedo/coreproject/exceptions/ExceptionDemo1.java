package incedo.coreproject.exceptions;

class A
{
	void get() throws Exception 
	{
		
	}
}
class B extends A
{
	@Override
	void get() throws ArithmeticException
	{
		
	}
}
public class ExceptionDemo1 {
	public static void main(String []args)
	{
		System.out.println("Starting of the program!!!");
		int a=10;
		int b=5;
		Object []arr=new Object[5];
		int i=0;
		try
		{
			i=10;
		int c=a/b;
		System.out.println("c is :"+c);
		System.out.println(arr[c].getClass());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("b cannot be zero");
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Index must be in range(0-4)");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(i);
		System.out.println("Ending of the Program!!!");
	}
}
