package incedo.lata.core.inheritance;

public abstract class Animal {
	private int total_Animals=100;
	Animal()
	{
		System.out.println("Animal is constructed with basic properties");
	}
	abstract void eat();		//Overriden
	abstract void sound();
}
