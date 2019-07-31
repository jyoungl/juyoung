
public class Coffee extends Beverage {
	public Coffee() {
		super("커피");
	}
	
	public void brew() {
		System.out.println(name + "는 내립니다.");
	}
	
	public void addCondiments() {
		System.out.println(name + "애 우유나 설탕을 첨가합니다.");
	}
}