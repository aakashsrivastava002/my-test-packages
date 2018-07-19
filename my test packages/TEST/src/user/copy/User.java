package user.copy;
import java.util.Date;
abstract class User {
	int libid;
	String name;
	book bk[]=new book[6];//size is 6 to limit number of books per user
	book re[]=new book[6];
	public User(int id,String n)
	{
		this.libid=id;
		this.name=n;
	}
	public void issue(book b)
	{
		b.issuedate=new Date();
		int i=0;
		while(bk[i]!=null)
		{
			bk[i]=b;
			b.user=this;
			i++;
		}
	}
	public void returnbk(book b)
	{
		b.returndate=new Date();
		int i=bk.length,j=0;
		while(bk[i]!=null)
		{
			if(bk[i]==b);
			{
				re[j]=bk[i];
				for(int k=i;k<bk.length;k++)
				{	bk[k]=bk[k+1];
					
				}
				j++;
			}
			i--;
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
	public String toString() {
		return ""+libid+":"+name;
	}
}
