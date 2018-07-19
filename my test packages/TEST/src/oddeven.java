import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class oddeven {

	public static void seperate(int n[])
	{
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		for (int i = 0; i < n.length; i++) {
			if(n[i]%2==0)
				even.add(n[i]);
			else
				odd.add(n[i]);
			
		}		
		for(int i=0;i<odd.size();i++)
		{
			System.out.print(odd.get(i)+" ");
		}
		System.out.println("");
		for(int i=0;i<even.size();i++)
		{
			System.out.print(even.get(i)+" ");
		}
	}
	public static void main(String arg[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		int limit=Integer.parseInt(s1);
		int number[]=new int[limit];
		String s=br.readLine();
		String[] spl=s.split(" ");
		for(int i=0;i<limit;i++) {
				
				number[i]=Integer.parseInt(spl[i]);
		}
		seperate(number);
	}
}
