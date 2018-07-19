package mystk;

import java.util.Scanner;
import java.util.Stack;
class OverflowException extends Exception
{
	
}
class UnderflowException extends Exception
{
	
}
public class MyStk {
	int ar[],top;
	public MyStk()
	{
		ar=new int[10];
		top=-1;
	}
	
public void push(int element)throws OverflowException
{

	if(top>=9) throw new OverflowException();
	ar[++top]=element;
	
}
public int pop() throws UnderflowException
{

	if(top==-1) throw new UnderflowException();
	return ar[top--];
}
public class Eceptiondemo{
	
	public static void pushsomevalues(MyStk s)
	{
		int num=5;
		assert(num==5);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number less than 10");
		
		System.out.println("how many to push");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x=sc.nextInt();
			s.push(x);
		}
	}
	public static  int popandsum()
	{
		int sum=0;
		for (int i = 0; i <s.size(); i++) {
			sum=sum+s.pop();
		}
		return sum;
	}

	public static void main(String arg[]) {
		
		MyStk s=new MyStk();
		while(sc.hasNextInt())
		{
			pushvalues(s);
		}
		int sum=sumofstk(s);
		System.out.println(sum);
}
}

}
