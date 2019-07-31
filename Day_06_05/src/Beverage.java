
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
		System.out.println("물을 끓입니다.");
	}
	
	public void brew() {
		System.out.println("내리거나 우려냅니다.");
	}
	
	public void pourInCup() {
		System.out.println("컵에 따릅니다.");
	}
	
	public void addCondiments() {
		System.out.println("첨가물을 첨가합니다.");
	}
}