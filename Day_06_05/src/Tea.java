
public class Tea extends Beverage {
	public Tea() {
		super("홍차");
	}
	
	public void brew() {
		System.out.println(name + "를 내립니다.");
	}
	
	public void addCondiments() {
		System.out.println(name + "에는 우유나 레몬을 첨가합니다.");
	}
}
