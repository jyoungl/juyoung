
public class AppStart {

	public static void main(String[] args) {
		Maker maker = new Maker();
		Beverage tmp;
		tmp = maker.getBeverage("ȫ��");
		tmp = maker.getBeverage("Ŀ��");
		tmp = maker.getBeverage("ȫ��");
		tmp = maker.getBeverage("Ŀ��");
		tmp = maker.getBeverage("ȫ��");
		System.out.println("�� " + maker.getCount() + "���� ����������ϴ�.");
	}

}