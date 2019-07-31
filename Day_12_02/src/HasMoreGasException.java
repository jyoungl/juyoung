
public class HasMoreGasException extends Exception implements iCommend {
	private Car car;
	public HasMoreGasException(Car car) {
		super("연료가 불충분합니다.");
		this.car = car;
	}
	
	public void execute() {
		System.out.println(getMessage());
		this.car.setGas(10);
		System.out.println("연료 10리터를 채웠습니다.");
	}
}
