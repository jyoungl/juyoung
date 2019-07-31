import java.util.HashSet;
import java.util.Iterator;
public class AppStart {
	public static void main(String[] args) {
//		Person f = new Person("홍길동", 1, 
//				new Person("심청이", 2,
//				new Person("이순신", 3)));
		
//		f.show();
		
		HashSet<Person> hs = new HashSet<>();
		HashSet<Person> hs2 = new HashSet<>(hs);
		Person a = new Person("홍길동", 1);
		Person b = new Person("심청이", 2);
		Person c = new Person("이순신", 3);
		Person d = new Person("홍길동", 1);

		hs.add(a);
		hs.add(b);
		hs.add(c);
		hs.add(d);
		
		Iterator<Person> it = hs.iterator();
		while(it.hasNext()) {
			it.next().show();
		}
	}
}
