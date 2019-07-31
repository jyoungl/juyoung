
public class Tea extends Beverage {

	public static final int PRICE = 3000;
	public static final String NAME = "È«Â÷";
	
	public Tea() {
		super(NAME, PRICE);
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}

	@Override
	public String getDescript() {
		return this.name;
	}

}
