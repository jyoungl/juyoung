
public class AppStart {
	public static void main(String[] args) {
//		MyNumber n = new MyNumber(100);
//		n = n.append(100).append(200);
//		n.print();

//		Car c = new Car("에쿠스", "현대", 3500, "검정", "가솔린");
//		c.showInfo();
		
//		CarBuilder cb = CarBuilder.getInstance();
//		Car car = cb.getCar();
//		car.showInfo();

		Car car = CarBuilder.getInstance()
							.setName("제네시스")
							.setColor("흰색")
							.setPrice(4000)
							.getCar();
		car.showInfo();
	}
}