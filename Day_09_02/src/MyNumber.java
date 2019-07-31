
public class MyNumber {
	private int number;
	public MyNumber(){
		this(0);
	}
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	public void print() {
		System.out.println(this.number);
	}
	
	public MyNumber append(int number) {
		this.number += number;
		return this;
	}
}
