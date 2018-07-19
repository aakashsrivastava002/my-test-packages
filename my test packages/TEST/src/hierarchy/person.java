package hierarchy;

public class person {
	person father,son;
	String name;
	public void printFamily()
	{
		person p=this;
		while(p.father!=null)
		{
			p=p.father;
		}
		do
		{
			System.out.println(p.name);
			p=p.son;
		}while(p!=null);
	}
	public person(String name)
	{
		this.name=name;
	}
}
