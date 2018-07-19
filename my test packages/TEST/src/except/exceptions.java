package except;
import java.util.Scanner;
public class exceptions {
	
	
	@SuppressWarnings("unused")
	public static void main(String arg[]) throws ShortPasswordException{

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String user,pwd;
		System.out.println("enter username");
		user=sc.next();
		System.out.println("enter password");
		pwd=sc.next();
		if(pwd.length()<6)
		{
			ShortPasswordException obj=new ShortPasswordException();
			throw obj;
		}
			
	}

}
