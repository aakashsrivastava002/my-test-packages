package arraylist;

import java.util.ArrayList;

public class mergelist {

	public static void main(String[] args) {
		
		ArrayList<Object> list1=new ArrayList<Object>();
		ArrayList<Object> list2=new ArrayList<Object>();
		ArrayList<Object> list3=new ArrayList<Object>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add("aa");
		list1.add(5.1);
		
		list2.add(5);
		list2.add(1);
		list2.add(3);
		list2.add("asd");
		list2.add(1.5);
		
		int i=0;
		list3.addAll(list2);
		while(i<list1.size()) {

			if(list2.contains(list1.get(i))==false)
			list3.add(list1.get(i));
			
		i++;
		}	
		
		System.out.println(list3);

	}

}
