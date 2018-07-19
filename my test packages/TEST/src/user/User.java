package user;
import java.util.Date;
abstract class User {
	int libid;// if you need to generate lib id set to to 0 and increment it in constructor
	String name;
	static book bk[]=new book[6];//size is 6 to limit number of books per user
	static book re[]=new book[6];
	public User(int id,String n)
	{
		this.libid=id;
		this.name=n;
	}
	public void issue(book b)
	{
		b.issuedate=new Date();
		int i=0;
		while(bk[i] !=null) {
			i++;
		}
		bk[i] = b;
		b.user=this;
		
	}
	public void returnbk(book b)
	{
		b.returndate=new Date();
		int i=0;
		while(re[i] !=null) {
			i++;
		}
		re[i] = b;
		b.user=this;
		int i1=0;
		for(;i1<bk.length;i1++)
		{
			if(bk[i1]==b);
			{
				bk[i1]=null;
			}
		}
	}
	public void setid(int libid)
	{
		this.libid=libid;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getid()
	{
		return libid;
	}
	public String getname()
	{
		return name;
	}
	public static User getuser(book b)
	{
		return b.user;
	}
	public String toString() {
		return ""+libid+":"+name;
	}
}
