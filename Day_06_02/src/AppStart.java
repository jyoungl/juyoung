
public class AppStart {
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		Pizza pizza = ps.order("��Ͼ�");
		
		if(pizza instanceof Pizza) {
			System.out.println("���� �ν��Ͻ��Դϴ�.");
		}
		
		if(pizza instanceof OnionPizza) {
			System.out.println("��Ͼ����� �ν��Ͻ�.");
			OnionPizza p = (OnionPizza)pizza;
		}
		
		if(pizza instanceof GarlicPizza) {
			System.out.println("�������� �ν��Ͻ�.");
		}
	}
}