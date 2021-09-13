package incedo.lata.core.multithreading;

public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new MyThread());
		
		System.out.println(t1.getState());
		
		t1.start();
		
		System.out.println(t1.getState());
		/*
		Thread t2=new Thread(new MyThread());
		t2.start();
		
		for(int i=11;i<=20;i++)
			System.out.println(i);
		*/
		System.out.println(t1.getState());
		
		t1.join(1);
		
		System.out.println(t1.getState());
		System.out.println("Active Count--"+Thread.activeCount());
	}
}
