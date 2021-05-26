 interface BasicCar extends Cloneable{
		public void getDetails();
		public BasicCar makeCopy();
	}

 package DesignPattern.Prototype;

 public class BasicCar {
 	private BasicCar[] carCache= {new Benz(),new Inova()};
 	public BasicCar getCarClone(String name) {
 		if(name.equalsIgnoreCase("Inova"))
 			return carCache[1].makeCopy();
 		if(name.equalsIgnoreCase("Benz"))
 			return carCache[0].makeCopy();
 		return null;
 	}
 }
 package DesignPattern.Prototype;

 public class Inova implements BasicCar{
 	final int price=400000;
 	final String name="Inova";
 	public Inova() {

 	}
 	public void getDetails() {
 		System.out.println("Name: "+name+", Cost: "+price);
 	}
 	public BasicCar makeCopy() {
 		Inova ob=null;
 		try {
 			ob=(Inova)super.clone();
 		} catch (CloneNotSupportedException e) {
 			e.printStackTrace();
 		}
 		return ob;
 	}
 }
 package DesignPattern.Prototype;

 public class Main {

 	public static void main(String[] args) {
 		BasicCarCache bcc=new BasicCarCache();
 		bcc.getCarClone("Benz").getDetails();
 		bcc.getCarClone("Inova").getDetails();
 	}

 }
 package DesignPattern.Prototype;

 public class Benz implements BasicCar{
 	final int price=300000;
 	final String name="Benz";
 	public Benz() {

 	}
 	public void getDetails() {
 		System.out.println("Name: "+name+", Cost: "+price);
 	}
 	public BasicCar makeCopy() {
 		Benz ob=null;
 		try {
 			ob=(Benz)super.clone();
 		} catch (CloneNotSupportedException e) {
 			e.printStackTrace();
 		}
 		return ob;
 	}
 }
