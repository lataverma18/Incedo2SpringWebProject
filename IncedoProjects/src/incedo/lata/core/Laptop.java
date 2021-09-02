package incedo.lata.core;

public class Laptop implements Button {
	@Override
	public void on() {
		System.out.println("Laptop is switched On!!!");
	}
	@Override
	public void off() {
		System.out.println("Laptop is switched Off!!!");
	}
	
}
