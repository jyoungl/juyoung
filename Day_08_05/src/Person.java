
public class Person implements Cloneable {
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Object obj = super.clone();
		((Person)obj).name = new String(this.name);
		((Person)obj).age = this.age;
		return obj;
	}
	
	public void showinfo() {
		System.out.println(this.name + " : " + this.age + " : " + this);
	}
}
