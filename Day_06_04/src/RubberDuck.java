
public class RubberDuck extends Duck {
	public RubberDuck() {
		super("������");
	}
	
	public void fly() { // ���� Ŭ������ �ñ״��� �����ؾ� ��(�Լ� �̸� ��ȯ�� �� ���ϴ� ��)
		System.out.println(super.name + "(��)�� �� �� �����ϴ�.");
	}
}