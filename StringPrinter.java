package multithread;

public class StringPrinter extends Thread {

	String s1;

	StringPrinter(String s1)
	{
		this.s1=s1;
	}
	public synchronized void run()
	{
		System.out.println(s1);
	}

}


