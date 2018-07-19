package model;

public class Student {

	private String name;
	private int roll;
	/**
	 * @param name
	 * @param roll
	 */
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String toString()
	{
		return "name: "+name+" :roll: "+roll;
	}
}
