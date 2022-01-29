package incedo.coreproject.abstractinterfaces;

public abstract class Animal {
	int i;
	Animal(int i)
	{
		System.out.println("Animal");
	}
	void basicFunctionalities()
	{
		System.out.println("Basic Functionalities of Animal");
	}
	abstract void sound();
}
