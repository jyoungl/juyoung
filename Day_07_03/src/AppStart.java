
public class AppStart {
	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		coffee = new Sugar(coffee);
		coffee = new Milk(coffee);
		
		Beverage tea = new Milk(new Tea());
		
		System.out.println("주문품목 : " + coffee.getDescript());
		System.out.println("결제금액 : " + coffee.getPrice() + "원");
		
		System.out.println("주문품목 : " + tea.getDescript());
		System.out.println("결제금액 : " + tea.getPrice() + "원");
		
	}
}