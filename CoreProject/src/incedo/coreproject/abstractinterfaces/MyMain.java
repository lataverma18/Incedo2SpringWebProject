package incedo.coreproject.abstractinterfaces;

public class MyMain {

	public static void main(String[] args) {
		Animal[] arr=new Animal[5];		//Heterogeneous
		
		Animal a=new Dog();
		a.basicFunctionalities();
		a.sound();
	}
}
