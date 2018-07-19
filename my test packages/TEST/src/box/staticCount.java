package box;

import java.util.Scanner;

public class staticCount {

	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("objects created= "+Box.getcount());
		Box b1=new Box(2,3,4);
		Box b2=new Box(4,5,6);
		int c=s.nextInt();
		Box.setcount(c);
		System.out.println("objects created= "+Box.getcount()+"\n"+b1.toString());
		
	}
}
