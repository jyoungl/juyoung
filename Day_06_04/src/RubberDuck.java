
public class RubberDuck extends Duck {
	public RubberDuck() {
		super("고무오리");
	}
	
	public void fly() { // 상위 클래스와 시그니쳐 동일해야 함(함수 이름 반환형 등 말하는 듯)
		System.out.println(super.name + "(이)가 날 수 없습니다.");
	}
}