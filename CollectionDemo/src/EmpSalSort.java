import java.util.*;
public class EmpSalSort implements Comparator<Employee> 
{

	@Override
	public int compare(Employee emp1, Employee emp2) 
	{
		if(emp1.salary>emp2.salary)
			return 1;
		else if(emp1.salary<emp2.salary)
			return -1;
		else
			return 0;
	}

}
