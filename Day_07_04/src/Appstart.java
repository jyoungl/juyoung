
public class Appstart {
	public static void main(String[] args) {
		Duck md = new MalleredDuck();
		Duck rd = new RubberDuck();
		Duck td = new ToyDuck();
		
		md.setFlyable(new FlyWithWing());
		rd.setFlyable(new FlyNoWay());
		td.setFlyable(new FlyNoWay());
		
		md.fly();
		rd.fly();
		td.fly();
	}
}
