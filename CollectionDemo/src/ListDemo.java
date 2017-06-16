import java.util.*;
public class ListDemo 
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
		
		System.out.println(list);
		
		list.add(2,"Vinod"); //Adding an element on a particular index
		
		System.out.println(list);
		
		list.remove(1); //Deleting an element from index 1
		
		System.out.println(list);
		
		list.set(2,"Lalitha");//Updated an element at index 2
		
		System.out.println(list);
		
	}
}
