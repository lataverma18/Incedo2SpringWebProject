package incedo.lata.core.multithreading;

import java.time.LocalTime;

public class ThreadDemo2 {

	public static void main(String[] args) {		
		Runnable task=()->{
			while(true)
			{
				System.out.println(LocalTime.now());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread th1=new Thread(task);
		th1.start();

	}

}
