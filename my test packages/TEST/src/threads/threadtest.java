package threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Scanner;


class filecopy extends Thread
	{
	@SuppressWarnings("resource")
	public void rwfile() throws IOException {
	FileInputStream fin = new FileInputStream("C:\\Users\\Aakash Srivastava\\DESKTOP FILES\\questions.txt");
	FileChannel file=fin.getChannel();
	WritableByteChannel out =Channels.newChannel(System.out);
	file.transferTo(0, file.size(), out);
	}
	@Override
	public void run() {
		try {
			rwfile();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
class Matrix implements Runnable {
	Scanner sc=new Scanner(System.in);
	private int a[][],row,col;
	public Matrix(int r,int c)
	{
		row=r;
		col=c;
		a=new int[row][col];
	}
	public Matrix() {
		
	}
	public void getInput()
	{
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
	}
	public void print()
	{
		for(int i=0;i<row;i++)
		{System.out.print("[ ");
			for(int j=0;j<col/2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			for(int j=col/2;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.print("]\n");
		}
	}
	@Override
	public void run() {
		try {
			Matrix a= new Matrix(2,2);
			a.getInput();
			a.print();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
public class threadtest {
	public static void main(String arg[]) throws InterruptedException {
		long time1=System.currentTimeMillis();
		filecopy f=new filecopy();
		Matrix a=new Matrix();
		f.start();

		System.out.println(time1+" ms");
		Thread obj=new Thread(a);
		obj.start();
		f.join();
		obj.join();
		long time2=System.currentTimeMillis();
		System.out.println(time2+" ms");
	} 
}
