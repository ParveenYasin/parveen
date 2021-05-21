import java.util.*;
public class MainMap {
	Map<String,String>hm=new HashMap<>();
	public void storeCountryCapitals(String c,String cap)
	{
	hm.put(c,cap);
	}
	public String getCapitalCountry(String c) {
	if(hm.containsKey(c))
		return hm.get(c);
	else
		return null;
	}
	public String getCountryByCapital(String cap)
	{
		Iterator<String>it=hm.keySet().iterator();
		while(it.hasNext())
		{
			String t=it.next();
			if(hm.get(t).equals(cap))
				return t;
		}
		return null;
	}
}
