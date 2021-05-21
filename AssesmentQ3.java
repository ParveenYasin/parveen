import java.util.*;
public class AssesmentQ3
{
	public static void main(String[] args){
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(12,90);
        hm.put(33, 90);
        hm.put(56,88);
        List<Integer> oddnum=new ArrayList<>();
        Iterator it=hm.keySet().iterator();
        int sum=0;
        int c=0;
        while(it.hasNext()){
            int t=(int) it.next();
            if(t%2!=0) {
                oddnum.add(t);
                sum+=hm.get(t);
                c+=1;
            }
        }
        System.out.println(sum/c);
    }
}


