import java.util.*;
public class ListIteratorDemo 
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
		
		ListIterator itr=list.listIterator();
		
		while(itr.hasNext())
		{
			Object ob=itr.next();
			
			if(ob instanceof String)
			{
				String str=(String)ob; //DownCasting to String
				System.out.println(str);
				
				if(str.equals("Kanika"))
					itr.set("Rishika");
			}
			else
			{
				Integer intr=(Integer)ob; //Downcasting to Integer
				System.out.println(intr);
			}
		}
		
		
		System.out.println(list);
	}
}
