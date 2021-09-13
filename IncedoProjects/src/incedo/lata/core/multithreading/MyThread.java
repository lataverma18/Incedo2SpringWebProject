package incedo.lata.core.multithreading;

public class MyThread implements Runnable {
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +"  "+Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
