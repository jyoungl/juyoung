
public class Coffee extends Beverage {

	private static final int PRICE = 2500;
	private static final String NAME = "Ŀ��";
	
	public Coffee() {
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
