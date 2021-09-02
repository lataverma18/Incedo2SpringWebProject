package incedo.lata.core;

public class Projector implements Button{

	@Override
	public void on() {
		System.out.println("Starts Projection!!!");
	}

	@Override
	public void off() {
		System.out.println("Stops Projection!!!");
	}
}
