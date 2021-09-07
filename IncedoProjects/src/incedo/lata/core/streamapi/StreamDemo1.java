package incedo.lata.core.streamapi;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StreamDemo1 {

	public static void main(String[] args) {
		int []arr= {10,80,-5,30,75,20,5,80,30};
		//10,80,5,30,75,20
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
		Arrays.stream(arr).forEach(a->System.out.println(a));
		System.out.println("--------");
		Arrays.stream(arr).filter((ele)->ele<=20).forEach(a->System.out.println(a));
		System.out.println("--------");
		Arrays.stream(arr).distinct().forEach(val->System.out.println(val));
		System.out.println("--------");
		Arrays.stream(arr).distinct().sorted().limit(3).forEach(val->System.out.println(val));
		System.out.println("--------");
		Arrays.stream(arr).distinct().skip(3).sorted().forEach(val->System.out.println(val));
		System.out.println("--------");
		int sum=Arrays.stream(arr).reduce((a, b)->a>b?a:b).getAsInt();
		System.out.println(sum);
		
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr).max());
		System.out.println(Arrays.stream(arr).min());
		
		
		
		OptionalInt result=Arrays.stream(arr).skip(3).sorted().findFirst();
		if(result.isPresent())
			System.out.println(result.getAsInt());
		
		
		System.out.println(Arrays.stream(arr).filter(obj->obj>70).findAny());
		
		System.out.println(Arrays.stream(arr).allMatch(ele->ele>0));
	}
}
