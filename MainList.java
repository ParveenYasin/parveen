import java.util.*;
import java.util.stream.Collectors;
public class MainList {
	List<Integer> l1=new ArrayList<Integer>();
	List<Integer> l2=new ArrayList<Integer>();
	public List<Integer> storeEvenNumbers(int n)
	{
		for(int i=2;i<=n;i+=2)
		{
			l1.add(i);
		}
		return l1;
     }
	public List<Integer> storeSquareEvenNumbers()
	{
		l2=l1.stream().map(x->x*2).collect(Collectors.toList());
		return l2;
	}
	public int find(int n)
	{
		if(l1.contains(n))
			return n;
		return 0;
	}
		
		

}
