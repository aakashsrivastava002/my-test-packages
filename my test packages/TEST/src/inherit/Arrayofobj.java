package inherit;

public class Arrayofobj {
	public static void main(String arg[]) {
		Person p1=new Person(23,"amit");
		Person p2=new Person(25,"Sumit");
		
		Studentp s1=new Studentp(19,"raj",110,"CSE");
		Studentp s2=new Studentp(18,"wnmeesh",111,"IT");
		
		Person []ar=new Person[4]; //ALLOCATES SPACE FOR REFERENCE TO STORE	
		ar[0]=p1;
		ar[1]=p2;
		ar[2]=s1;
		ar[3]=s2;
		showAll(ar);
	}
	public static void showAll(Person ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i].show();
		}
	}

}
