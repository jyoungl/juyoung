
public abstract class Duck {
	String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void quack() {
		System.out.println(this.name + "¿Ã ≤–≤– øÛ¥œ¥Ÿ.");
	}
	
	public void fly() {
		System.out.println(this.name + "(¿Ã)∞° ≥Ø¿æ¥œ¥Ÿ.");
	}
}