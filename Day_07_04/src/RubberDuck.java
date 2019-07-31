
public class RubberDuck extends Duck {
	public static final String NAME = "고무오리";
	
	public RubberDuck() {
		super(NAME);
	}
	
	public void fly() {
		System.out.println(name + "는 날 수 없으므로 대신 달립니다.");
	}
}