package incedo.lata.core.inheritance;

public class B extends A{
void put()
{
	System.out.println("put of B");
}

public static void main(String[] args) {
	A a1=new A();
	a1.get();
	//a1.put();
	a1.set();
	a1.out();
}
}
