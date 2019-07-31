
public abstract class Beverage {
	protected String name;
	protected int price;

	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract int getPrice();
	public abstract String getDescript();
}
