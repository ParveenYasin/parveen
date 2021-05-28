abstract class Burger implements Item{
	public Pack getPack(Pack pack,Item burger) {
		pack.setBurger(burger);
		return pack;
	}
	abstract public String getName();
	abstract public double getPrice();
	abstract public String getPack();
}
public class ChickenBurger extends Burger{
	private static final String name="Chicken Burger";
	private static final String pack="Wrapper";
	private static final double price=150;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getPack() {
		return pack;
	}
}
public class Coke extends ColdDrink{
	private static final String name="Coke";
	private static final String pack="Bottle";
	private static final double price=60;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getPack() {
		return pack;
	}
}
abstract class ColdDrink implements Item{
	public Pack getPack(Pack pack,Item drink) {
		pack.setColdDrink(drink);
		return pack;
	}
	abstract public String getName();
	abstract public String getPack();
	abstract public double getPrice();
}
public interface Item {
	public Pack getPack(Pack pack,Item item);
}
public class Main {

	public static void main(String[] args) {
		VegMealBuilder v=new VegMealBuilder();
		v.buildMeal();
		NonVegMealBuilder nv=new NonVegMealBuilder();
		nv.buildMeal();
	}

}
public interface MealBuilder {
	void buildMeal();
}
public class NonVegMealBuilder implements MealBuilder{
	@Override
	public void buildMeal() {
		Item b=new ChickenBurger();
		Item d=new Coke();
		Pack p=new Pack();
		p.setBurger(b);
		p.setColdDrink(d);
		System.out.println("Non Veg Meal");
		System.out.println("Item: "+p.getBurger().getName()+",Packing: "+p.getBurger().getPack()+",Price: "+p.getBurger().getPrice());
		System.out.println("Item: "+p.getColdDrink().getName()+",Packing: "+p.getColdDrink().getPack()+",Price: "+p.getColdDrink().getPrice());
		System.out.println("Total Cost: "+(p.getBurger().getPrice()+p.getColdDrink().getPrice()));
	}

}public class Pack {
	private Burger burger;
	private ColdDrink drink;
	public void setBurger(Item burger) {
		this.burger=(Burger)burger;
	}
	public void setColdDrink(Item drink) {
		this.drink=(ColdDrink)drink;
	}
	public Burger getBurger() {
		return burger;
	}
	public ColdDrink getColdDrink() {
		return drink;
	}
}
public class Pepsi extends ColdDrink{
	private static final String name="Pepsi";
	private static final String pack="Bottle";
	private double price=80;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getPack() {
		return pack;
	}

}
public class VegBurger extends Burger{
	private static final String name="Veg Burger";
	private static final String pack="Wrapper";
	private double price=100;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getPack() {
		return pack;
	}
}
public class VegMealBuilder implements MealBuilder{
	@Override
	public void buildMeal() {
		Item b=new VegBurger();
		Item d=new Pepsi();
		Pack p=new Pack();
		p.setBurger(b);
		p.setColdDrink(d);
		System.out.println("Veg Meal");
		System.out.println("Item: "+p.getBurger().getName()+",Packing: "+p.getBurger().getPack()+",Price: "+p.getBurger().getPrice());
		System.out.println("Item: "+p.getColdDrink().getName()+",Packing: "+p.getColdDrink().getPack()+",Price: "+p.getColdDrink().getPrice());
		System.out.println("Total Cost: "+(p.getBurger().getPrice()+p.getColdDrink().getPrice()));
	}
}