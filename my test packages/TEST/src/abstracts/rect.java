package abstracts;


public class rect extends figure {
	double len,wid;
	public rect(double len,double wid)
	{
		this.len=len;
		this.wid=wid;		
	}
	public double area()
	{
		return (len*wid);
	}

}
