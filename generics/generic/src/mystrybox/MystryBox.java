package mystrybox;

public class MystryBox<T> {
	
	T data;
	MystryBox(T data)
	{
		this.data=data;
	}
	public T getData()
	{
		return data;
	}

}
