package sample;
public class CricketTeam {
	private static String captain;
	private static class CricketTeamHolder{
		private static CricketTeam instance=new CricketTeam();
	}
	public static CricketTeam getInstance() {
		return CricketTeamHolder.instance;
	}
	public void setCaptain(String captainName) {
		if(captain==null) {
			captain=captainName;
			System.out.println("New captain selected for our team");
		}
		else
			System.out.println("You already have a captain for our team. Send him to toss");
	}
	public String getCaption() {
		return captain;
	}


}


