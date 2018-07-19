package abstracts;


public class cir extends figure {
	
	double rad;
	public cir(double rad)
	{
		this.rad=rad;
	}
	public double area()
	{
		return (3.14*rad*rad);
	}
}
