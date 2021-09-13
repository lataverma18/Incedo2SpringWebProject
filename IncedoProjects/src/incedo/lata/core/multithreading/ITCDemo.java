package incedo.lata.core.multithreading;

public class ITCDemo {

	public static void main(String[] args) {
		Storage s=new Storage();
		
		Producer p=new Producer(s);
		
		Consumer c=new Consumer(s);
		
		p.start();
		c.start();

	}

}
