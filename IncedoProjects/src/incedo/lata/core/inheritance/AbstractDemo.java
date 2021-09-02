package incedo.lata.core.inheritance;

public class AbstractDemo {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
		a.sound();
		
		a=new Lion();
		a.eat();
		a.sound();
		
		System.out.println(Inf1.i);
	}
}
