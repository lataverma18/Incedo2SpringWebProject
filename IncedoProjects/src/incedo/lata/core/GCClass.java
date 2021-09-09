package incedo.lata.core;

public class GCClass {
		void get()
		{
			System.out.println("get of A");
		}
		public void finalize()
		{
			System.out.println("Resource Releasing operation");
		}	
}
