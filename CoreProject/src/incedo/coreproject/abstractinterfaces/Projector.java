package incedo.coreproject.abstractinterfaces;

public class Projector implements Button{
	@Override
	public void on() {
		System.out.println("Projector is switched On");
	}
	@Override
	public void off() {
		System.out.println("Projector is switched Off");
	}
	@Override
	public void get() 
	{
		System.out.println("Projector Interface method");
	}
}
