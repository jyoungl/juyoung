
abstract class Character {
	String name;
	
	public Character(String name) {
		this.name = name;
	}
	
	public final void move(int a) {
		final int a = 10;
		System.out.println("ĳ���Ͱ� �̵��մϴ�.");
	}
	
	public abstract void fight(); // �ݵ�� ��ӵ� ������ ������
}