import java.util.ArrayList;

public class AppStart {
	
	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book("ȫ�浿��", 1000));
		al.add(new Book("��û��", 1500));
		al.add(new Book("�Ƿ��̵�", 1200));
		
//		System.out.println(al.size());
//		Book b = al.get(0);
//		b.showInfo();
//		al.get(1);
		
		Book removeItem = al.remove(0);
		System.out.println("������ ������ : " + removeItem.getName());
		for(int i=0; i<al.size(); i++) {
			al.get(i).showInfo();
		}
	}
}
