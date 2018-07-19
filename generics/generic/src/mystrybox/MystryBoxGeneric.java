package mystrybox;

public class MystryBoxGeneric {
	
	public static void main(String arg[])
	{
		MystryBox box=new MystryBox<String>("amit");
		System.out.println(box.getData());
		Rectangle r=new Rectangle(4,5);
		MystryBox box2=new MystryBox<Figure>(r);
		System.out.println(box2.getData());
		/*handleMystryBox(box2);
		handleMystryBox(box);
	}
	public static void handleMystryBox(MystryBox<Figure> box)
	{
		System.out.println("Handling figure");
		System.out.println(box.getData());*/
	}

}
