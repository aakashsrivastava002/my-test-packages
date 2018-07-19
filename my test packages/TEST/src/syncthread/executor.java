package syncthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class executor {

	public static void main(String arg[]) throws InterruptedException {
//	ExecutorService tpool=Executors.newFixedThreadPool(3);
//	List<Callable<Object>> task=new ArrayList<>();
//	for(int i=1;i<=10;i++)
//	{
//		task.add(new Callable<Object>() {
//			
//			@Override
//			public Object call() throws Exception {
//				System.out.println(Thread.currentThread().getName()+" Starts");
//				Thread.sleep(new Random().nextInt(10)*1000);
//				System.out.println(Thread.currentThread().getName()+" Stops");
//				return "Thread after sleep";
//			}
//		});
//	}
//	tpool.invokeAll(task);
//	tpool.shutdown();
		ScheduledThreadPoolExecutor executor2=new ScheduledThreadPoolExecutor(3);
		executor2.schedule(new BigWork("1"),10, TimeUnit.SECONDS);
		executor2.schedule(new BigWork("2"),5, TimeUnit.SECONDS);
		executor2.schedule(new BigWork("3"),12, TimeUnit.SECONDS);
		//executor2.scheduleAtFixedRate(new BigWork("Repeated Work"), 1, 5, TimeUnit.SECONDS);
	}
}
