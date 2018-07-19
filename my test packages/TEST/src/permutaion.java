import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class testPermutaion {

	public static int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public int permute(String sample) 
	{	
		int len=sample.length(),num=0;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < len; i++) {
		  char c = sample.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		num=fact(len);
		ArrayList<Integer> rep=new ArrayList<>();
		rep.addAll(map.values());
		for (int j = 0; j < rep.size(); j++) {
			num=num/fact(rep.get(j));
		}
		return num;
	}
}
public class permutaion
{
	public static void main(String arg[])throws IOException {
		String sample=new BufferedReader(new InputStreamReader(System.in)).readLine();
		testPermutaion obj=new testPermutaion();
		System.out.println(obj.permute(sample));
	}
}
