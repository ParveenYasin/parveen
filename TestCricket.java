package sample;
public class TestCricket 
{
	public static void main(String[] args) 
	{
		CricketTeam c1=CricketTeam.getInstance();
		System.out.println("Trying to make a captain for our team");
		c1.setCaptain("Dhoni");
		System.out.println("Trying to make another captain for our team");
		CricketTeam c2=CricketTeam.getInstance();
		c2.setCaptain("Virat");
		if(c1.equals(c2)) {
			System.out.println("c1 and c2 are same instance");
		}
	}
}

