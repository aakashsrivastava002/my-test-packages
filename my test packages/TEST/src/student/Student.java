package student;
import java.util.*;
public class Student {

	int roll,marks;
	String name;
	Date date;
	public Student (int r,String n,Date d,int m)
	{
		this.roll=r;
		this.name=n;
		this.date=d;
		this.marks=m;
	}
	public int getroll()
	{
		return roll;
	}
	public String getname()
	{
		return name;
	}
	public Date getdate()
	{
		return date;
	}
	public void sort(Student ar[])
	{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i].roll>ar[i+1].roll)
				{
					Student t=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=t;
				}
			}
	}
	
}
