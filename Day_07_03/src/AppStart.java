
public class AppStart {
	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		coffee = new Sugar(coffee);
		coffee = new Milk(coffee);
		
		Beverage tea = new Milk(new Tea());
		
		System.out.println("�ֹ�ǰ�� : " + coffee.getDescript());
		System.out.println("�����ݾ� : " + coffee.getPrice() + "��");
		
		System.out.println("�ֹ�ǰ�� : " + tea.getDescript());
		System.out.println("�����ݾ� : " + tea.getPrice() + "��");
		
	}
}