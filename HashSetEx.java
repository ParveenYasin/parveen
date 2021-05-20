package collection;
import java.util.*;
public class HashSetEx 
{
	static Set<Integer> num=new HashSet<Integer>();
	static public Set CountryNames()
	{
		Set<String> mylist=new HashSet<String>();
		mylist.add("india");
		mylist.add("america");
		mylist.add("newzeland");
		mylist.add("Greenland");
		mylist.add("europe");
		return mylist;
	}
	static public Set modify()
	{
	 for(int i=11;i<=15;i++)
	  num.add(i);
	  return num;
	}
	static public Set numbers()
	{
		for(int i=1;i<10;i++)num.add(i);
		return num;
	}	
}




