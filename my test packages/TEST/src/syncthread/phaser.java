package syncthread;

import java.util.Random;
import java.util.concurrent.Phaser;

class phaserDemo extends Thread implements Runnable{

	Phaser ph=new Phaser();

	/**
	 * @param ph
	 */
   public phaserDemo(Phaser ph) {
		super();
		this.ph = ph;
	}
	@Override
	public void run() {
	
		for (int i = 1; i <=5; i++) {
		try {
			int sleeptime=(new Random().nextInt(10)+6)*1000;
			System.out.println(Thread.currentThread().getName()+" running cycle "+i);
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" finishing cycle "+i);
		}
	}
}
public class phaser
{
	public static void main(String arg[]) throws InterruptedException {

		Phaser pw=new Phaser(2);
		System.out.println("registered parties = "+pw.getRegisteredParties());
		phaserDemo p1=new phaserDemo(pw);
		phaserDemo p2=new phaserDemo(pw);
		p1.start();
		p2.start();
		p1.join();
		p2.join();
		System.out.println("Main Ends");
	}
}
