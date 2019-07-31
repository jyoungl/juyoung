
public class ToyDuck extends Duck{
	public static final String NAME = "장난감오리";
	
	public ToyDuck() {
		super(NAME);
	}
	
	public void fly() {
		System.out.println(name + "는 날 수 없으므로 대신 달립니다.");
	}
}
