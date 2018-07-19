package user.copy;
import java.util.*;
public class lib {
	public static void main(String arg[])
	{
		fac f1=new fac(101,"samit",1104,"prof");
		fac f2=new fac(102,"amit",1105,"asst. prof");
		fac f3=new fac(103,"sam",1106,"prof");
		stu s1=new stu(104,"st1",1010,"cse");
		stu s2=new stu(105,"st2",1011,"it");
		book b1=new book(501,"java");
		book b2=new book(502,"c");
		book b3=new book(503,"c++");
		book b4=new book(504,"java swings");
		book b5=new book(505,"java servletts");
		f1.issue(b1);
		f2.issue(b2);
		f3.issue(b3);
		s1.issue(b4);
		s2.issue(b5);
		System.out.println(b1.issuedate);
	}
}
