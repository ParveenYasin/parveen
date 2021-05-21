import java.util.*;
public class MainSet 
{
	Set<String> country=new HashSet<>();
	public void storeCountryName(String Country)
	{
		country.add(Country);
	}
	public String findCountry(String Country)
	{
		Iterator<String> it=country.iterator();
		while(it.hasNext())
		{
			if(it.next().equals(Country))
				return Country;
		}
		return null;
	}


}
