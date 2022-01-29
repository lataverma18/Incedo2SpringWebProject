package incedo.coreproject.labdasandstreams;

@FunctionalInterface
interface Inf1
{
	int get(int a);
}


public class LambdaDemo1 {
	
	static void getInt(Inf1 i1)
	{
		
	}
public static void main(String []args)
{
	/*Inf1 i1=new Inf1(){
		public void get()
		{
			System.out.println("get of A");
		}
	};*/
	
	getInt(a->Math.abs(-5));
	getInt(a->++a);
	getInt(a->0);
	getInt(a->a*a);
	
	Inf1 i1=a->Math.abs(-a);
	
	System.out.println(i1.get(-67));
}
}
