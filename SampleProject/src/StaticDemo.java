
class A
{
	static
	{
		System.out.println("static A");
	}
	static void get()
	{
		System.out.println("get of A");
	}
}
class B
{
	static
	{
		System.out.println("static B");
	}
	void put()
	{
		System.out.println("put of B");
	}
}
class C
{
	static
	{
		System.out.println("static C");
	}
	static void set()
	{
		System.out.println("set of C");
	}
}


public class StaticDemo {

	static {
		System.out.println("static Main Class");
	}
	
	public static void main(String []args)		//---->JVM(StaticDemo.main(...))
	{
		System.out.println("Starting of Main");
		A.get();
		C.set();
		B b1=new B();
		b1.put();
		System.out.println("Ending of Main");
	}
	static void abc()
	{
		System.out.println("Abc static");
	}
}
