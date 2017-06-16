import java.util.*;
public class EmpSort 
{
	public static void main(String arg[])
	{
		TreeSet<Employee> ts=new TreeSet<Employee>();
		
		ts.add(new Employee(1001,"Vinod","Hyderabad",78000));
		ts.add(new Employee(1003,"Suresh","Hyderabad",67000));
		ts.add(new Employee(1002,"Fareed","Mumbai",86000));
		
		for(Employee emp:ts)
		{
			System.out.println(emp);
		}
		
	}
}
