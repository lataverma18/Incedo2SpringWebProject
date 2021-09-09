package incedo.lata.core.collections;

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<Integer> gd=new GenericClass<>();
		gd.setI(10);
		System.out.println(gd.getI());
		
		GenericClass<String> gd1=new GenericClass<>();
		gd1.setI("Lata");
		System.out.println(gd1.getI());
	}
}
