
public class AppStart {

	public static void main(String[] args) {
		Car c = new Car(5);
		c.setException(new HasMoreGasException(c));
		c.run();
	}

}
