import java.util.ArrayList;

public class AppStart {

	public static void main(String[] args) {
		Duck md = new MallerdDuck();
		Duck rd = new RubberDuck();
		
		md.fly();
		rd.fly();
		
		if(md instanceof MallerdDuck) {
		((MallerdDuck)md).run(); // md 타입은 duck인데 duck에 run 없으니 승인 x
		}
		
//		Duck[] ducks = { new MallerdDuck(), new RubberDuck() };
//		for(int i=0 ; i<ducks.length ; i++) {
//			ducks[i].fly();
//		}
//		
//		ArrayList<Duck> ducks = new ArrayList<Duck>();
//		ducks.add(new MallerdDuck());
//		ducks.add(new RubberDuck());
//		for(int i=0 ; i<ducks.size(); i++)
//			ducks.get(i).fly();
		
		//Duck md = new MallerdDuck();
		//Duck rd = new RubberDuck();
		//Duck duck = new Duck("오리");
		// 상위 클래스는 객체 생성하면 안됨 <- abstract 붙임 = new 못함
	}
}