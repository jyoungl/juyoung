
public class Sugar extends Condiment {
	public static final int PRICE = 500;
	public static final String NAME = "º≥≈¡";
	
	public Sugar(Beverage beverage) {
		super(NAME, PRICE, beverage);
	}
	
	public int getPrice() {
		return this.price + this.beverage.getPrice();
	}
	
	public String getDescript() {
		return this.beverage.getDescript() + ", " + this.name + "√∑∞°";
	}
}