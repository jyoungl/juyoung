
public class HasMoreGasException extends Exception implements iCommend {
	private Car car;
	public HasMoreGasException(Car car) {
		super("���ᰡ ������մϴ�.");
		this.car = car;
	}
	
	public void execute() {
		System.out.println(getMessage());
		this.car.setGas(10);
		System.out.println("���� 10���͸� ä�����ϴ�.");
	}
}
