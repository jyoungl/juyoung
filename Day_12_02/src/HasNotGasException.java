
public class HasNotGasException extends Exception implements iCommend {
	public static final int INCREMENT = 5;
	private Car car;
	public HasNotGasException(Car car) {
		super("연료가 없습니다.");
		this.car = car;
	}
	
	public void execute() {
		System.out.println(this.getMessage());
		car.setGas(INCREMENT);
		System.out.println(INCREMENT + "리터를 주유하였습니다.");
		System.out.println("혀재 연료량 : " + car.getGas() + "리터");
	}
}
