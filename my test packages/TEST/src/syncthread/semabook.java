package syncthread;

import java.util.concurrent.Semaphore;

class book
{
	String title;
    Semaphore access;
	int num;
	public book(String t,int num)
	{
		super();
		this.title=t;
		this.num=num;
		access=new Semaphore(num);
	}
	public void read() throws InterruptedException {
		
		access.acquire();
		System.out.println(Thread.currentThread().getName()+" Student reading book "+title);
	}
	public void finish() {
		access.release();
		System.out.println(Thread.currentThread().getName()+" Student has finished reading "+title);
	}
	
}
class student extends Thread
{
	book b;
    public student (book b)
    {
    	super();
    	this.b=b;	
    }
    public void run() {
		
    	try {
			b.read();
			Thread.sleep(1000);
			b.finish();
    	} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
}
public class semabook {

	public static void main(String arg[]) {
		
		book b=new book("Java", 2);
		student s1=new student(b);
		student s2=new student(b);
		student s3=new student(b);
		student s4=new student(b);
		s1.start();s2.start();s3.start();s4.start();
		
	}
}
