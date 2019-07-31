
public abstract class Operand {
	protected String type;
	protected boolean state;
	
	public Operand(String type) {
		this.type = type;
		this.state = false;
	}
	
	public void setState(boolean state) {
		this.state = state;
	}
	
	public boolean getState() {
		return this.state;
	}
	
	public void showInfo() {
		System.out.println("현재 " + type + "의 상태 : ");
		System.out.println(state ? "양호" : "나쁨");
	}
}
