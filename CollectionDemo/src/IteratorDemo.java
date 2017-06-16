import java.util.*;
public class IteratorDemo 
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
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			Object ob=itr.next();
			
			if(ob instanceof String)
			{
				String str=(String)ob; //DownCasting to String
				System.out.println(str);
				
				if(str.equals("Kanika"))
					itr.remove();
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
