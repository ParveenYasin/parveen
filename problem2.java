
public class problem2 {
public static void main(String[] args) {
	MainMap m2=new MainMap();
	m2.storeCountryCapitals("India","Africa");
	m2.storeCountryCapitals("pakis", "USA");
	System.out.println(m2.getCapitalCountry("India"));
	System.out.println(m2.getCapitalCountry("Africa"));
}
}
