public class Employee //implements Comparable<Employee>
{
	int empid,salary;
	String empname,addr;
	
	public Employee(int eid,String ename,String addr,int sal)
	{
		empid=eid;
		empname=ename;
		this.addr=addr;
		salary=sal;
	}
	
	public String toString()
	{
		return "Employee ID:"+empid+" Employee Name:"+empname+" Employee Salary:"+salary+" Address:"+addr;
	}

	/*@Override
	public int compareTo(Employee emp) 
	{
		System.out.println(this.empid+"::::"+emp.empid);
		
		if(this.empid>emp.empid)
			return 1;
		else if(this.empid<emp.empid)
			return -1;
		else
			return 0;
		
	}*/
	
	
}
