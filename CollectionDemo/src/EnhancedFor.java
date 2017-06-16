import java.util.ArrayList;

public class EnhancedFor 
{
	public static void main(String arg[])
	{
		ArrayList list=new ArrayList();
		
		//Adding objects to the Collection 
		
		list.add("Sunita");
		list.add("Subash");
		list.add("Kanika");
		
		list.add(new Integer(10));
		list.add(new Integer(20));
		
		for(Object element:list)
		{
			if(element instanceof String)
			{
				String str=(String)element; //DownCasting to String
				System.out.println(str);
			}
			else
			{
				Integer intr=(Integer)element; //Downcasting to Integer
				System.out.println(intr);
			}
		}
	}
}
