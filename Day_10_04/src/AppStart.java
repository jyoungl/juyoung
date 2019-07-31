import java.util.TreeSet;
import java.util.Iterator;
public class AppStart {
		private TreeSet<Person> ts;
		
		public AppStart() {
			ts = new TreeSet<Person>();
		}
		
		public void add(String name, int id) {
			ts.add(new Person(name, id));
		}
		
		public void add(Person p) {
			ts.add(p);
		}
		
		public void print() {
			Iterator<Person> it = ts.descendingIterator();
			while(it.hasNext()) {
				Person tmp = it.next();
				tmp.show();
			}
		}
		public static void main(String[] args) {
			AppStart app = new AppStart();
			app.add("홍길동", 1);
			app.add("심청이", 2);
			app.add(new Person("이순신", 3));
			app.print();
		}
}
