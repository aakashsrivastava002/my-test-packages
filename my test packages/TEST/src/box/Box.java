package box;

public class Box {

	
	double len,wth,ht;
	int id;
	private static int count=0;
	public Box(double len,double wth, double ht)
	{
		count++;
		id=count;
		this.len=len;
		this.wth=wth;
		this.ht=ht;
	}
	public double volume()
	{
		return len*wth*ht;
	}
	public static void setcount(int n)
	{
		count=n;
	}
	public static int getcount()// if take user input for static member
	{
		return count;
	}
	public String toString()
	{
		return "length: "+len+" width: "+wth+" height: "+ht;
	}
}
