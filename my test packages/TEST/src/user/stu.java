package user;

public class stu extends User {
	int roll;
	String sec;
	public stu(int id,String n,int r,String s)
	{
		super(id,n);
		this.roll=r;
		this.sec=s;
	}
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public int getroll()
	{
		return roll;
	}
	public void setsec(String sec)
	{
		this.sec=sec;
	}
	public String getsec()
	{
		return sec;
	}
}
