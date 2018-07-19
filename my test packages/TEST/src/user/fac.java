package user;

public class fac extends User {
	int facid;
	String design;
	public fac(int libid,String name,int facid,String n)
	{
		super(libid,name);
		this.facid=facid;
		this.design=n;
	}
	public void setfacid(int facid)
	{
		this.facid=facid;
	}
	public int getfacid()
	{
		return facid;
	}
	public void setdesign(String design)
	{
		this.design=design;
	}
	public String getdesign()
	{
		return design;
	}
	public String toString()
	{
		return""+facid+":"+design;
	}

}
