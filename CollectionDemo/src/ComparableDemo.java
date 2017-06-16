import java.util.*;
public class ComparableDemo 
{
	public static void main(String arg[])
	{
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(1001,"Vinod","Hyderabad",78777));
		list.add(new Employee(1002,"Suresh","Mumbai",67777));
		list.add(new Employee(1003,"Kiran","Hyderabad",88777));
		
		Collections.sort(list,new EmpSalSort());

		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		
	}
}
