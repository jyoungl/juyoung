
public class HasNotGasException extends Exception implements iCommend {
	public static final int INCREMENT = 5;
	private Car car;
	public HasNotGasException(Car car) {
		super("���ᰡ �����ϴ�.");
		this.car = car;
	}
	
	public void execute() {
		System.out.println(this.getMessage());
		car.setGas(INCREMENT);
		System.out.println(INCREMENT + "���͸� �����Ͽ����ϴ�.");
		System.out.println("���� ���ᷮ : " + car.getGas() + "����");
	}
}
