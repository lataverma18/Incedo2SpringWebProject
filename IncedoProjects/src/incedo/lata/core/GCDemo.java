package incedo.lata.core;


public class GCDemo {
	public static void main(String[] args) {
		GCClass gc1=new GCClass();
		gc1.get();
		GCClass gc2=new GCClass();
		gc2.get();
		gc1=null; //Available for GC
		gc2=null; //Available for GC
		System.gc();
		System.out.println("End of the Main");
	}
}
