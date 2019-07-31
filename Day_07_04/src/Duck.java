
public abstract class Duck {
	protected String name;
	protected Flyable func;
	
	public Duck(String name) {
		this.name = name;
		this.func = null;
	}
	
	public void setFlyable(Flyable func) {
		this.func = func;
	}
	
	public void fly() {
		if(this.func == null) {
			System.out.println("�� �� �ִ� ����� �������� �ʾҽ��ϴ�.");
		}
		else
			this.func.fly();
	}
}