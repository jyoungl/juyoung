
public class Beverage {
	String name;
	
	public Beverage(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void make() {
		this.boiledWater();
		this.brew();
		this.pourInCup();
		this.addCondiments();
	}
	
	public void boiledWater() {
		System.out.println("���� ���Դϴ�.");
	}
	
	public void brew() {
		System.out.println("�����ų� ������ϴ�.");
	}
	
	public void pourInCup() {
		System.out.println("�ſ� �����ϴ�.");
	}
	
	public void addCondiments() {
		System.out.println("÷������ ÷���մϴ�.");
	}
}