
public class AppStart {
	public static void main(String[] args) {
		Flyable mp = new ModelPlane(); //달릴 수 없음
		
		if(mp instanceof Flyable) {
			System.out.println("날 수 있는 것");
		}
		if(mp instanceof IRun) {
			System.out.println("달릴 수 있는 것");
		}
		
		mp.fly();
		mp.run();
	}
}