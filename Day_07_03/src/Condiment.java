
public abstract class Condiment extends Beverage {
	protected Beverage beverage;
	
	public Condiment(String name, int price, Beverage beverage) {
		super(name, price);
		this.beverage = beverage;
	}
}