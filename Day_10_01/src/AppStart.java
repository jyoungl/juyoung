import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Person{
	private String name;
	private int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String toString() {
		return "ID : " + this.id + " 이름 : " + this.name;
	}
	
	public void show() {
		System.out.println("ID : " + this.id + "이름 : " + this.name);
	}
}

public class AppStart {
	public static void main(String[] args) {
		HashMap<String, Person> hm = new HashMap<>();
		hm.put("ONE", new Person("홍길동", 1));
		hm.put("TWO", new Person("심청이", 2));
		
		System.out.println(hm.get("ONE"));
		System.out.println(hm.get("TWO"));
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(hm.get(key));
		}
	}
}