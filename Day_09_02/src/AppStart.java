
public class AppStart {
	public static void main(String[] args) {
//		MyNumber n = new MyNumber(100);
//		n = n.append(100).append(200);
//		n.print();

//		Car c = new Car("����", "����", 3500, "����", "���ָ�");
//		c.showInfo();
		
//		CarBuilder cb = CarBuilder.getInstance();
//		Car car = cb.getCar();
//		car.showInfo();

		Car car = CarBuilder.getInstance()
							.setName("���׽ý�")
							.setColor("���")
							.setPrice(4000)
							.getCar();
		car.showInfo();
	}
}