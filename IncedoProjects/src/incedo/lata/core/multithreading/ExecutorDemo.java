package incedo.lata.core.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es=Executors.newCachedThreadPool();
		
		Callable<Double> r=()->Math.PI;
		
		for(int i=1;i<=20;i++)
		{
			System.out.println(es.submit(r).get());
		}
		System.out.println("Ending of Main Method");
	}
}
