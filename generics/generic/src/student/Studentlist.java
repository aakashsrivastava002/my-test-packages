package student;

import java.util.*;

public class Studentlist {
	int roll,age;
	String name,dept;
	double cgpa;
	public Studentlist() {}
	public Studentlist(int roll, int age, String name, String dept, double cgpa) {
		super();
		this.roll = roll;
		this.age = age;
		this.name = name;
		this.dept = dept;
		this.cgpa = cgpa;
	}
	List <Studentlist> list = new LinkedList<>();
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public void addstudent()
	{
		list.add(new Studentlist(this.getRoll(),this.getAge(),this.getName(),this.getDept(),this.getCgpa()));
	}
	@SuppressWarnings("resource")
	public void deletestudent()
	{
		System.out.println("enter roll number of student to delete");
		int i=new Scanner(System.in).nextInt();
		for(Studentlist stu:list) {
			if(stu.getRoll()==i)
			{
				int in=list.indexOf(stu);
				list.remove(in);
			}
		}
		
	}
	public void getdetail(int n)
	{/*
		for(Studentlist stu:list) {
		if(stu.getRoll()==n)
		{ 
		*/	//int i=list.indexOf(stu);
			System.out.println(list.get(0));
		/*}
		else
			System.out.println("null");
	
		}*/
	}
	public void getlist()
	{
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
	}
	public String toString()
	{
		return ""+getRoll()+" "+getAge()+" "+getName()+" "+getDept()+" "+getCgpa();
	}
}
