package incedo.coreproject.exceptions;

public class ExceptionDemo3 {

	public static void main(String[] args){
		int age=-10;
		try
		{
		if(age<0)
			throw new NegativeAgeException("Age cannot be negative");
		}
		catch(NegativeAgeException ne)
		{
			System.out.println(ne.getMessage());
		}
		System.out.println("Ending of the Program");
	}
}
