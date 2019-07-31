
public abstract class Duck {
	String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void quack() {
		System.out.println(this.name + "�� �в� ��ϴ�.");
	}
	
	public void fly() {
		System.out.println(this.name + "(��)�� �����ϴ�.");
	}
}