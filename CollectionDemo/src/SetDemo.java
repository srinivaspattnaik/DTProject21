import java.util.*;

public class SetDemo 
{
	public static void main(String arg[])
	{
		HashSet hs=new HashSet();
		
		hs.add("Gagan");
		hs.add("Sukumar");
		hs.add("Vinod");
		hs.add("Arnab");
		hs.add("Vinod");
		
		System.out.println("HashSet element"+hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Gagan");
		lhs.add("Sukumar");
		lhs.add("Vinod");
		lhs.add("Arnab");
		
		System.out.println("Linked HashSet Element:"+lhs);
		
		TreeSet ts=new TreeSet();
		ts.add("Gagan");
		ts.add("Sukumar");
		ts.add("Vinod");
		ts.add("Arnab");
		
		System.out.println("TreeSet Element:"+ts);
	}
}
