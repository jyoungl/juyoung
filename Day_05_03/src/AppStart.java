import java.util.ArrayList;

public class AppStart {
	
	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<Book>();
		al.add(new Book("홍길동전", 1000));
		al.add(new Book("심청전", 1500));
		al.add(new Book("권력이동", 1200));
		
//		System.out.println(al.size());
//		Book b = al.get(0);
//		b.showInfo();
//		al.get(1);
		
		Book removeItem = al.remove(0);
		System.out.println("삭제된 서적명 : " + removeItem.getName());
		for(int i=0; i<al.size(); i++) {
			al.get(i).showInfo();
		}
	}
}
