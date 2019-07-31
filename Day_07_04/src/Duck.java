
public abstract class Duck {
	protected String name;
	protected Flyable func;
	
	public Duck(String name) {
		this.name = name;
		this.func = null;
	}
	
	public void setFlyable(Flyable func) {
		this.func = func;
	}
	
	public void fly() {
		if(this.func == null) {
			System.out.println("날 수 있는 방법이 지정되지 않았습니다.");
		}
		else
			this.func.fly();
	}
}