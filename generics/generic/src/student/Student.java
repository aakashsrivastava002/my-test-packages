package student;
import java.util.*;
public class Student {
	
	@SuppressWarnings("resource")
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);int o;
		while(true)
		{
			System.out.println("what to do?");
			System.out.println("1: add student");
			System.out.println("2: Students list");
			System.out.println("3: view already viewed student list");
			System.out.println("4: Student details");
			System.out.println("5: delete student");
			System.out.println("6: exit");
		Studentlist stu=new Studentlist();
		o=sc.nextInt();
		switch(o)
			{
			case 1: System.out.println("enter roll number, age, name, department, CGPA");
			int r=sc.nextInt();int a=sc.nextInt();String n=sc.next();String d=sc.next();double c=sc.nextDouble();
			Studentlist student=new Studentlist(r,a,n,d,c);
			student.addstudent();
				break; 
			case 2: stu.getlist();
				break;
			case 3: //student.viewlist();
				break;
			case 4: System.out.println("enter student roll"); 
			int i=sc.nextInt();	
			stu.getdetail(i);
				break;
			case 5: 
				stu.deletestudent();
				break;
			case 6: System.exit(0);
				break;
			default: System.out.println("Invalid Option");
				break;
			}
		}
	}
}
