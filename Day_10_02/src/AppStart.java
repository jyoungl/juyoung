import java.util.Vector;
public class AppStart {
	public static void main(String[] args) {
		Vector<Person> v = new Vector<>();
		v.add(new Person("ȫ�浿", 1));
		v.add(new Person("��û��", 2));
		v.add(new Person("�̼���", 3));
		
		for(int i=0 ; i<v.size() ; i++) {
			Person p = v.elementAt(i);
			p.show();
		}
	}
}