
public class CarBuilder {
	private Car car;
	
	private CarBuilder() {
		car = new Car("현대", "에쿠스", 3500, "검정", "가솔린");
	}
	
	public static CarBuilder getInstance() {
		return new CarBuilder();
	}
	
	public CarBuilder setName(String name) {
		this.car.setName(name);
		return this;
	}
	
	public CarBuilder setVender(String vender) {
		this.car.setVender(vender);
		return this;
	}
	
	public CarBuilder setPrice(int price) {
		this.car.setPrice(price);
		return this;
	}
	
	public CarBuilder setColor(String color) {
		this.car.setColor(color);
		return this;
	}
	
	public CarBuilder setFuel(String fuel) {
		this.car.setFuel(fuel);
		return this;
	}
	
	public Car getCar() {
		return this.car;
	}
}
