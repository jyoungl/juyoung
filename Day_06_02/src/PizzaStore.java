
public class PizzaStore {
	public Pizza order(String pizzaName) {
		switch(pizzaName) {
		case "��Ͼ�":
			System.out.println("��Ͼ����ڸ� �������ϴ�.");
			return new OnionPizza();
		case "����":
			System.out.println("�������ڸ� �������ϴ�.");
			return new GarlicPizza();
		default:
			System.out.println("������� �ʴ� ǰ���Դϴ�.");
			return null;
		}
	}
}