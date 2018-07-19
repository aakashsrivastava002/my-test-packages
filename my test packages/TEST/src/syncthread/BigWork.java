package syncthread;

import java.util.Random;

public class BigWork implements Runnable {

	String n;
	/**
	 * @param n
	 */
	public BigWork(String n) {
		super();
		this.n = n;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Big Work Starts "+n);
		try {
			Thread.sleep(1000+new Random().nextInt(5)*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Big Work Over "+n);
	}

}
