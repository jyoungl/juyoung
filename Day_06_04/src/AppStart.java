import java.util.ArrayList;

public class AppStart {

	public static void main(String[] args) {
		Duck md = new MallerdDuck();
		Duck rd = new RubberDuck();
		
		md.fly();
		rd.fly();
		
		if(md instanceof MallerdDuck) {
		((MallerdDuck)md).run(); // md Ÿ���� duck�ε� duck�� run ������ ���� x
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
		//Duck duck = new Duck("����");
		// ���� Ŭ������ ��ü �����ϸ� �ȵ� <- abstract ���� = new ����
	}
}