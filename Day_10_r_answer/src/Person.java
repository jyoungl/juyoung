
public abstract class Person implements Comparable, Cloneable {
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
		if(o==null)
			return false;
		if(!(o instanceof Person))
			return false;
		Person p = (Person)o;
		if(this.name == null) {
			if(p.name != null) return false;
		}
		else {
			if(!this.name.equals(p.name)) return false;
		}
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * (result + ((this.name == null) ? 1 : this.name.hashCode()));
		return result;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Object o = super.clone();
		Person p = (Person)o;
		p.name = new String(this.name);
		return o;
	}
	
	public abstract void showInfo();
}
