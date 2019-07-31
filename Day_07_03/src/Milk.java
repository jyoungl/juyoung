
public class Milk extends Condiment {
	public static final int PRICE = 800;
	public static final String NAME = "¿ìÀ¯";
	
	public Milk(Beverage beverage) {
		super(NAME, PRICE, beverage);
	}
	
	public int getPrice() {
		return this.price + this.beverage.getPrice();
	}
	
	public String getDescript() {
		return this.beverage.getDescript() + ", " + this.name + "Ã·°¡";
	}
}