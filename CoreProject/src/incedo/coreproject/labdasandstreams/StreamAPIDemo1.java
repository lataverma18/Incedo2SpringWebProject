package incedo.coreproject.labdasandstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
		int []arr= {23,45,67,89,10,45,78,89};
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr).min().getAsInt());
		System.out.println(Arrays.stream(arr).max().getAsInt());
		Arrays.stream(arr).forEach(a->System.out.println(a));
		System.out.println("--------Sorted------");
		Arrays.stream(arr).sorted().forEach(a->System.out.println(a));
		System.out.println("--------Filtered------");
		Arrays.stream(arr).filter(a->a>50).forEach(v->System.out.println(v));
		System.out.println("--------Distinct------");
		Arrays.stream(arr).distinct().limit(3).forEach(a->System.out.println(a));
	}
}
