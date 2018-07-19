package user.copy;
import java.util.Date;
public class book {
	int bkid;
	String title;

	book(int bkid,String title)
	{
		this.bkid=bkid;
		this.title=title;
	}
	User user;//=new book();
	Date issuedate;
	Date returndate;
	public void setbkid(int bkid)
	{
		this.bkid=bkid;
	}
	public int getbkid()
	{
		return bkid;
	}
	public void settitle(String title)
	{
		this.title=title;
	}
	public String gettitle()
	{
		return title;
	}
	public Date getdateissue()
	{
		return issuedate;
	}
	public Date getdatereturn()
	{
		return returndate;
	}
//	public User getuserissued() {
//	
//		for(int i=0;i<u.bk.length;i++)
//		{
//			return (user.bk[i]);
//		}
//	}
	public String toString()
	{
		return ""+bkid+":"+title;
	}
}

