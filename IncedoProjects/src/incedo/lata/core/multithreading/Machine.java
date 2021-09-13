package incedo.lata.core.multithreading;

public class Machine extends Thread{
	Printer p;
	Machine(Printer p)
	{
		this.p=p;
	}
	public void run()
	{
		synchronized(p)
		{
		p.printing();
		}
	}
}
