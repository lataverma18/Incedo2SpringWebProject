
public class MyMain {

	public static void main(String[] args) {
		//Dynamic Binding or Dynamic Method Dispatching
		
		Emp e1=new Emp(10);
		e1.displayDetails();
		e1.abc();
		
		e1=new Developer();
		e1.displayDetails();
		e1.abc();
		
		Developer.abc();
		/*Developer d=new Developer();
		d.setTechnology("Java");
		d.getDetails(101, "Naveen",45000);
		d.displayDetails();
		d.oldDisplay();
		Developer.abc();*/
	}
}
