
public class Student {
	private String name;
	private int rate;
	private int count;
	
	public Student(String name, int rate) {
		this.name = name;
		this.rate = rate;
		this.count = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void setCount() {
		this.count += 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getRate() {
		return this.rate;
	}
	
	public void showInfo() {
		System.out.println(this.name + " : " + this.rate);
		System.out.println(this.count + " 번 탑승했습니다.");
	}
	
	public boolean rideBus(bus b) {
		if(this.rate >= b.getPer()) {
			this.rate -= b.getPer();
			b.setRate(b.getRate() + b.getPer());
			this.count += 1;
			b.setCount();
			return true;
		}
		return false;
	}
}
