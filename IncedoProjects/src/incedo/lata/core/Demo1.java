package incedo.lata.core;

public class Demo1 {
	public static void main(String[] args) {
		Button btn=new Projector();
		btn.on();
		btn.off();
		Button.displayLight();
		
		btn=new Laptop();
		btn.on();
		btn.off();
		Button.displayLight();
	}
}
