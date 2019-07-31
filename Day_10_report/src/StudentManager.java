import java.util.TreeSet;
import java.util.Iterator;

public class StudentManager {
	private TreeSet<Student> students = new TreeSet<Student>();
	private static int count = 0;
	
	public void add(Person p) {
		students.add((Student) p);
	}
	
	public boolean remove(Student p) {
		Iterator<Student> it = students.iterator();
		
		while(it.hasNext()) {
			Student st = it.next();
			String n = st.getName();
			int g = st.getRank();
			if(n==p.getName() && g==p.getRank()) {
				students.remove(st);
				return true;
			}
		}
		System.out.println("명단에 학생이 존재하지 않습니다.");
		return false;
	}
	
	public Person[] remove(String name) {
		Iterator<Student> it = students.iterator();
		Person[] ps = null;

		while(it.hasNext()) {
			Student st = it.next();
			String n = st.getName();
			if(n==name) {
				students.remove(st);
				ps[count]=st;
				count++;
			}
		}
		System.out.println("명단에 학생이 존재하지 않습니다.");
		return ps;
	}
	
	Person[] search(String name) {
		
	}
	
	Person[] search(int rank) {
		
	}
	
	public void printAll() {
		for(Student s : students) {
			System.out.println(s);
		}
		System.out.println( );
	}
}
