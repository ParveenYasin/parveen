public interface AdvanceMediaPlayer {
	void loadFileName(String name);
	void listen();
}
public class AdvanceMediaPlayerAdapter implements MediaPlayer{
	AdvanceMediaPlayer amd;
	public AdvanceMediaPlayerAdapter(String type,String name) {
		if(type.equalsIgnoreCase("vlc"))
			amd=new VlcPlayer();
		else if(type.equalsIgnoreCase("mp4"))
			amd=new Mp4Player();
		amd.loadFileName(name);
	}
	@Override
	public void play(String type, String name) {
		if(type.equalsIgnoreCase("vlc"))
			amd.listen();
		else if(type.equalsIgnoreCase("mp4"))
			amd.listen();
	}

}
public class AudioPlayer implements MediaPlayer{
	AdvanceMediaPlayerAdapter mpa;
	@Override
	public void play(String type, String name) {
		if(type.equalsIgnoreCase("mp3"))
			System.out.println("Playing "+type+", Name: "+name);
		else if(type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
			mpa=new AdvanceMediaPlayerAdapter(type,name);
			mpa.play(type, name);
		}
	}

}public class Main {

	public static void main(String[] args) {
		AudioPlayer ap=new AudioPlayer();
		ap.play("mp3","Horizon");
		ap.play("mp4","Venilavay");
		ap.play("vlc","Earth song");
	}

}
public interface MediaPlayer {
	void play(String type,String name);
}
public class Mp4Player implements AdvanceMediaPlayer{
	private String name;
	@Override
	public void loadFileName(String name) {
		this.name=name;
	}

	@Override
	public void listen() {
		System.out.println("Playing mp4 file. Name: "+name);
	}

}
public class VlcPlayer implements AdvanceMediaPlayer{
	private String name;
	@Override
	public void loadFileName(String name) {
		this.name=name;
	}

	@Override
	public void listen() {
		System.out.println("Playing vlc file. Name: "+name);
	}

}