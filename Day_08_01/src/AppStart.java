
public class AppStart {
	public static void main(String[] args) {
		Flyable mp = new ModelPlane(); //�޸� �� ����
		
		if(mp instanceof Flyable) {
			System.out.println("�� �� �ִ� ��");
		}
		if(mp instanceof IRun) {
			System.out.println("�޸� �� �ִ� ��");
		}
		
		mp.fly();
		mp.run();
	}
}