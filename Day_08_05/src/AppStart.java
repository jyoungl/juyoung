
public class AppStart {
	public static void main(String[] args) throws Exception {
		Person p = new Person("ȫ�浿", 20);
		Person s = (Person)p.clone();
		p.showinfo();
		s.showinfo();
		
		System.out.println(p == s); // false
		System.out.println(p.equals(s)); // true
		System.out.println(p.hashCode() == s.hashCode()); // true
	}
}