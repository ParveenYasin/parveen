package Test;
import java.util.*;
public class AssesmentQ1 
{
	static List<Integer> l=new ArrayList<Integer>();
	static boolean isPalindrome(int n)
	{
		int temp=n,sumpal=0;
		while(n>0)
		{
			int r=n%10;
			sumpal=sumpal*10+r;
			n=n/10;
		}
		if(sumpal==temp)return true;
		{return false;
		}
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n=sc.nextInt();
		System.out.println("enter the second number");
		int m=sc.nextInt();
		int sumpal=0;
		for(int i=n;i<=m;i++)
		{
			if(isPalindrome(i))
			{
				l.add(i);
				sumpal=sumpal+i;
			}
		}
		System.out.println(l);
		System.out.println(sumpal);

	}	

}
