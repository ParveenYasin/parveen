import java.util.*;
public class AssesmentQ4 {
	public static void main(String[] args) {
	    String s[]= {"goa","kerala","gujarat"};
	    HashMap<String,String> n=new HashMap<> ();
	    for(String sr:s) {
	        n.put(sr.substring(0,3).toUpperCase(),sr);
	    }
	    System.out.print(n);
	}
	}


