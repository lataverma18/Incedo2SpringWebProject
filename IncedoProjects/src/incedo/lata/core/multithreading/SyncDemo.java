package incedo.lata.core.multithreading;

public class SyncDemo {

	public static void main(String[] args) {
		Printer p=new Printer();
		
	Machine m1=new Machine(p);
	m1.setName("Machine 1");
	Machine m2=new Machine(p);
	m2.setName("Machine 2");
	Machine m3=new Machine(p);
	m3.setName("Machine 3");
	Machine m4=new Machine(p);
	m4.setName("Machine 4");
	Machine m5=new Machine(p);
	m5.setName("Machine 5");
	
	m1.start();
	m2.start();
	m3.start();
	m4.start();
	m5.start();

	}

}
