import java.lang.Comparable;

public abstract class Person {
	protected String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Object o) {
		return true;
	}
	
	public abstract int hashCode();
	
	public abstract Object clone() throws CloneNotSupportedException;
	
	public abstract void showInfo();
}
