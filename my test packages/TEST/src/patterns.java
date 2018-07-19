import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class patterns {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		while(true) 
		{
			System.out.println("enter regex pattern:");
			Pattern pattern=Pattern.compile(sc.nextLine());
			System.out.println("enter text:");
			Matcher matcher=pattern.matcher(sc.nextLine());
			boolean found=false;
			while(matcher.find())
			{
				System.out.println("I found the text "+matcher.group()+" Starting at "+matcher.start()+" and ended at "+matcher.end());
				found=true;
			}
			String replaceAll=matcher.replaceAll("C++");
			System.out.println(replaceAll);
			if(!found)
			{
				System.out.println("no match found");
			}
		}//while
	}//main
}//class
