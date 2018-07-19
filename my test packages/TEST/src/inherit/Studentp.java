package inherit;

public class Studentp extends Person {
	private int roll;
	private String branch;
	public Studentp(int age,String name,int roll,String branch)
	{
		super(age,name);
		this.roll=roll;
		this.branch=branch;
	}
	public void show()
	{
		System.out.println("student "+roll+"."+branch);
	}
}
