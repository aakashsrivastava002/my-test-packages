package threads;

class parallelWork extends Thread
{
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(""+i+" "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
	}
}
class parallelWorknew implements Runnable
{
	public void run() {
		for (int i = 0; i <=5; i++) {
			System.out.println(""+i+" "+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
	}
}
public class BasicThreads {

	public static void main(String[] args) throws InterruptedException {
		
		parallelWork pw=new parallelWork();
		pw.start();
		parallelWorknew pwn=new parallelWorknew();
		Thread obj=new Thread(pwn);
		obj.start();
		pw.join();
		obj.join();// main thread is now blocked and waiting for joined threads to complete
		System.out.println("Main ends");
//		for (int i = 0; i <=5; i++) {
//			System.out.println(""+i+" "+Thread.currentThread().getName());
//			try
//			{
//				Thread.sleep(1000);
//			}catch (InterruptedException e) {
//					
//				e.printStackTrace();
//			}
//		}
	}
}
