package incedo.coreproject.labdasandstreams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo2 {
	public static void main(String[] args) {
		Supplier s=()->Math.PI;
		System.out.println(s.get());

		Consumer c=a->System.out.println(a+"\t"+((String)a).length());
		c.accept("Lata");
		
		Predicate p=a->(int)a%2==0;
		System.out.println(p.test(10));
		
		Function f=a->((String)a).charAt(0);
		System.out.println(f.apply("Lata"));
	}
}
