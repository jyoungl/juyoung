import java.util.HashSet;
import java.util.Iterator;
public class AppStart {
	public static void main(String[] args) {
//		Person f = new Person("ȫ�浿", 1, 
//				new Person("��û��", 2,
//				new Person("�̼���", 3)));
		
//		f.show();
		
		HashSet<Person> hs = new HashSet<>();
		HashSet<Person> hs2 = new HashSet<>(hs);
		Person a = new Person("ȫ�浿", 1);
		Person b = new Person("��û��", 2);
		Person c = new Person("�̼���", 3);
		Person d = new Person("ȫ�浿", 1);

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
