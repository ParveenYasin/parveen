import java.util.*;
public class Hashmap {
	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
		addele(hm);
		for(Integer s:hm.keySet()) {
			System.out.println(s+""+hm.get(s));
		}
	}
public static void addele(Map<Integer,String>hm) {
	hm.put(1,"parveen");
	hm.put(2,"yasin");
}
}
