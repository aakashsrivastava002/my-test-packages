import java.util.Scanner;

public class scanner {
	
	public static void main(String arg[])
	{
		Scanner s= new Scanner(System.in);
//		int i=s.nextInt(16);
//		System.out.println(i);
	/*	System.out.println("enter your name");
		String name=s.nextLine();
		System.out.println("enter all the friends name seperated by comma");
		String friends=s.nextLine();
		String list[]=friends.split(",");
		System.out.println("name= "+name);
		int count=0;
		for(String l:list)
		{
		System.out.println("friends names= "+l);
		count++;
		}
		System.out.println("total: "+count+" friends");*/
		//skip function
//		String a="a1a2s52s5d7f4fa6sfgr66h4ew97w6gh4eg6598hw856ge1eg54";
		
//		while (true) {
//			s.skip("[a-z]+");
//			int v = s.nextInt();
//			System.out.println(v);
//		s.useDelimiter("_"); //usually next reads one string but using delimiter we can manipulate and make it read untill  _ comes
//		String a=s.next();
//		System.out.println(a);
//		}
//		System.out.printf("%-30s%d\n","samosa",10);
//		System.out.printf("%-30s%d\n","grilled sandwich",35);
		int value=235;
		System.out.println(String.format("value= %d", value));
	}
}
