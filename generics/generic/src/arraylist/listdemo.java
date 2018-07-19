package arraylist;

import java.util.*;

public class listdemo {

	public static void main(String arg[])
	{
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(38);
		list.add(4);
		list.add(1);
		list.add(7);
		list.add(1);
//		for(int i=0;i<list.size();i++) {
//		   for(int j=i+1;j<list.size();j++)
//		   {
//			   if(list.get(i)==list.get(j))				n^2 complexity
//			   list.remove(j);
//		   }
//		   
//		}
		//or
		int i=0;
		while(i<list.size()) {
			int n=list.get(i);
			if(i!=list.lastIndexOf(n))				// n complexity
				list.remove(i);
			i++;
		}
		
		System.out.println(list);
		
	}
}
