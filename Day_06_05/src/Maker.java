
public class Maker {
	private int count;
	
	public Maker() {
		count = 0;
	}
	
	public Beverage getBeverage(String type) {
		Beverage beverage = null;
		switch(type) {
		case "Ŀ��":
			beverage = new Coffee();
			beverage.make();
			count++;
			break;
			
		case "ȫ��":
			beverage = new Tea();
			beverage.make();
			count++;
			break;
		
		default:
			break;
		}
		return beverage;
	}
	public int getCount() {
		return this.count;
	}
}