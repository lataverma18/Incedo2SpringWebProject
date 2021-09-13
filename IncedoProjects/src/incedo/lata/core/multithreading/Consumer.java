package incedo.lata.core.multithreading;

public class Consumer extends Thread{
		Storage s;
		Consumer(Storage s)
		{
			this.s=s;
		}

		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				synchronized(s)
				{
				if(!s.isFull())
					try {
						s.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				System.out.println("Consumer is consuming :"+i);
				s.setFull(false);
				s.notify();
				}
			}
		}
}
