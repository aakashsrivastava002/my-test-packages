package threads;


class tortoise extends Thread{
	
	int count=0;
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			while(count<9999999)
			{
				count++;
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class rabbit implements Runnable{
	
	int count=0;
	@Override
	public void run() {
	try {
		Thread.sleep(1000);
		while(count<9999999)
		{	
			count++;
			if(count==4555555) {
			Thread.sleep(99999999*9999999);
			count++;
			}
		}
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
}


public  class tortoise_and_rabbit {
	public static void main(String arg[]) throws InterruptedException {

		tortoise t=new tortoise();
		rabbit r=new rabbit();
		long t1=System.currentTimeMillis();
		System.out.println("starts at "+t1+" ms");
		Thread obj=new Thread(r);
		t.start();
		long t2=System.currentTimeMillis();
		System.out.println("tortoise time "+t2);
		obj.start();
		long t3=System.currentTimeMillis();
		System.out.println("rabbit time "+t3);
	}	
}
