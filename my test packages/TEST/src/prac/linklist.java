package prac;

class Node // acting as structure in c,c++
{
	int info;
	Node next;
}
class mylinkedlist
{
	Node start=null;
	void insert(int info)
	{
		Node newNode=new Node();
		newNode.info=info;
		newNode.next=start;
		start=newNode;
	}
	void addattwo(int info)
	{
		Node n=new Node();
		n.info=info;
		n.next=start.next;
		start.next=n;
	}
	void delete(int info)
	{
		Node p=new Node();
		Node temp=start;
		while (temp!=null) {
			if(temp.info==info)
			{
				p.info=info;
				p.next=p.next.next;
				temp.next=p;
			}
			else
				temp=temp.next;
		}
	}
	void print() {
		// TODO Auto-generated method stub
		Node temp=start;
		while (temp!=null) {
			System.out.println(temp.info+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
public class linklist {

	public static void main(String arg[]) {
		mylinkedlist list=new mylinkedlist();
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.addattwo(2);
		list.print();
		list.delete(2);
	}
	
}
