import java.util.*;
public class sortarray {
	public static void sortarraystring(String ar[])
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(ar[j].compareToIgnoreCase(ar[j+1])>0)
				{
					String temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
	}
	public static String multiplespacesingle(String str) // to trim spaces in between
	{
		str=str.trim();//String ans=""; this will create a lot of string resulting in garbage hence pressuring jvm instead we can use string buffer
		StringBuffer ans=new StringBuffer("");// string buffer will keep on incrementing string in the same buffer
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			if(c!=' ')
//			{
//				ans=ans.append(c);
//				continue;
//			}
//			else 
//			{
//				ans=ans.append(c);
//				while(c==' ')
//				{
//					i++;
//					c=s.charAt(i);
//				}i--;
//			}
//		}
		//with split method
		String s[]=str.split("[ ]+");
		for(String s1:s)
		{
			ans.append(s1);
			ans.append(" ");
		}
		ans.trimToSize();
		return ans.toString();
	}
	public static void main(String arf[])
	{
		String ar[]= {"aakash","zen","deepak","ashu"};
		sortarraystring(ar);
		for(String e:ar)
			System.out.println(e+" ");
		String str="  the           hostel   is  booked";
		
		System.out.println(multiplespacesingle(str));
		
//		String st="hello my dear friends";   when split space
//		String []spl=st.split(" ");
//		for(String s1:spl)
//		System.out.println(s1);
		
		
//		String st="hello my-dear friends";	when split space with other symbols
//		String []spl=st.split("[ -]");
//		for(String s1:spl)
//		System.out.println(s1);				
		String st="hello            my       dear          friends"; // when split multiple spaces else extra spaces will result in extra lines on console
		String []spl=st.split("[ ]+");
		for(String s1:spl)
		System.out.println(s1);
		String word="ABCDE";
		for(int i=1;i<=word.length();i++)
		{
			System.out.println(word.substring(0,i));
		}
		for(int i=word.length()-1;i>0;i--)
		{
			System.out.println(word.substring(0,i));
		}
		String line="i and am the sumit and amit were in danger";
		System.out.println(line.contains("and"));
		// all indexes where and is found
		searchindexes(line," ");
	}
	public static void searchindexes(String line,String chk)
	{
		String s[]=line.split("");
		ArrayList <Integer> index=new ArrayList<Integer>();
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(chk))
			{
				index.add(i);
			}
		}
		for(int i=0;i<index.size();i++)
		System.out.print(index.get(i));	
		
	}
}
