package abstracts;

public class Absfig {
	public static void main(String arg[])
	{
		figure f=new rect(3,4);
		rect r=new rect(4,5);
		cir c=new cir(6);
		System.out.println(f.area());
		System.out.println(r.area());
		System.out.println(c.area());
	}

}
