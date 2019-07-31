

public class AppStart {
	public static void main(String[] args) {
		Circle c1 = new Circle(100, 200, 50.0F);
		Circle c2 = new Circle();
		
		c1.showInfo();
		c2.showInfo(200);
	}
}
