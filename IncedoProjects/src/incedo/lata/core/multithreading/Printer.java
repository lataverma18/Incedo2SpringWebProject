package incedo.lata.core.multithreading;

public class Printer {
	public void printing()
	{
		System.out.println("Printer Started printing the Doc "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printer Completed printing the Doc "+Thread.currentThread().getName());
	}
}
