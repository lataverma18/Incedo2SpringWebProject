package incedo.lata.core;

public interface Button {
	void on();
	void off();
	static void displayLight()
	{
		System.out.println("Button will be displayed with light");
	}
}
