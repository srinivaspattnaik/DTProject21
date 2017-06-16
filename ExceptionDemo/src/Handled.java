public class Handled 
{
	public static void main(String arg[])
	{
		int num1=42,num2=2,result;
		
		try
		{
		result=num1/num2;
		System.out.println("Result:"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception:"+ae);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("Completed - Last Line");
	}
}
