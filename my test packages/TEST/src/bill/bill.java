package bill;
import java.util.*;
public class bill {

	public static void main(String arg[]) {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Item> map=new HashMap<>();
		int sum=0;
		map.put(1,new Item("samosa", 10));
		map.put(2,new Item("patty", 15));
		map.put(3,new Item("sandwich", 25));
		map.put(4,new Item("grilled sandwich", 35));
		System.out.println("Items available:\n\nItem NO    Item Name         Item Cost");
		for(Integer key:map.keySet()) {
		
			String name=map.get(key).getName();
			int cost=map.get(key).getPrice();
			System.out.printf("%-11d%-18s%d\n",key,name,cost);
		}
		System.out.println("\n\nEnter Your Order Number!!");
		List<Integer> itemno=new ArrayList<>();
		List<Integer>quantities=new ArrayList<>();
		while(true)
		{
			if(sc.hasNextInt())
			{
				int no=sc.nextInt();
				int q=sc.nextInt();
				itemno.add(no);
				quantities.add(q);
			}
			else
			{
				String done=sc.nextLine();
				if(done.equals("done"))
					break;
			}
		}
		System.out.println("\nYour Bill:\n\nItem No    Item Name         Amount");
		
	    for(int i=0;i<itemno.size();i++) 
	    {
			int key=itemno.get(i);
	    	String name=map.get(key).getName();
			int quant=quantities.get(i);
			int cost=map.get(key).getPrice()*quant;
			sum=sum+cost;
			System.out.printf("%-11d%-18s%d\n",key,name,cost);
			
	    }
	    System.out.printf("\nTOTAL COST: %d/-",sum);
	}
}
