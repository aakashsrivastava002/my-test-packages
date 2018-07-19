import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
class checkstring
{
	public String permutation(String s1,String s2)
	{
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			if(map1.containsKey(a))
			{
				int cnt=map1.get(a);
				map1.put(a, ++cnt);
			}
			else
			{
				map1.put(a,1);
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			char a=s2.charAt(i);
			if(map2.containsKey(a))
			{
				int cnt=map2.get(a);
				map2.put(a, ++cnt);
			}
			else
			{
				map2.put(a,1);
			}
		}
		if(map1.equals(map2))
		{
			return "permutation";
		}
		else
			return "not a permutaion";
		
	}
}
public class CheckPermutaion {

	public static void main(String[] args)throws IOException {
		String s1=new BufferedReader(new InputStreamReader(System.in)).readLine();
		String s2=new BufferedReader(new InputStreamReader(System.in)).readLine();
		checkstring obj=new checkstring();
		System.out.println(obj.permutation(s1,s2));
	}

}
