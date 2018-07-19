package mystrybox;

public class Rectangle extends Figure {

	double len,wid;
	public Rectangle(double len,double wid)
	{
		this.len=len;
		this.wid=wid;		
	}
	public double area()
	{
		return (len*wid);
	}

}
