package incedo.lata.core.exceptions;

public class CustomExceptionDemo {

	public static void main(String[] args) {
	System.out.println("Starting of the Main");
	int age=-10;
	/*try
	{*/
	if(age<0)
		throw new NegativeAgeException("Age cannot be negative");
	/*}
	catch(NegativeAgeException na)
	{
		System.out.println(na);
	}*/
	System.out.println("End of the Main");
	}
}
