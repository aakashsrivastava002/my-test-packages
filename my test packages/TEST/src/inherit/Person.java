package inherit;

public class Person {
	private int age;
	private String name;
	public Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void show()
	{
		System.out.println("age: "+age+" name: "+name);
	}
}
