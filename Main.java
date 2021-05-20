package multithread;

public class Main {

	public static void main(String[] args) {
		PrinterThread p1=new PrinterThread("Hello..","there");
		StringPrinter p2=new StringPrinter("How are You");
		SyncExMain p3=new SyncExMain("Thank you,  ","very Much");
		Thread t=new Thread(p1);
		Thread t1=new Thread(p2);
		Thread t2=new Thread(p3);
		t.start();
		t1.start();
		t2.start();

	}
} 

