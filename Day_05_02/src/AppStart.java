
public class AppStart {
	public static void main(String[] args) {
		Book b1 = new Book("ȫ�浿��", 20000);
		//Book b2 = b1; // ���� �ν��Ͻ��� ����Ŵ  <- �ĺ��� ����(���� ����)
		//Book b2 = new Book(b1); // b1�� �� ����
		//Book b2 = b1.copy(); �����Ŷ� ����
		Book b = new Book("...", 1000);
		
		Book[] books = new Book[3];
		books[0] = new Book("ȫ�浿��", 2000);
		books[1] = new Book("�Ƿ��̵�", 2500);
		books[2] = new Book("��2�ǹ���", 3000);
		
		Book[] books2 = new Book[3];
		for(int i=0 ; i<books.length ; i++)
			books2[i] = books[i].copy(); // �ν��Ͻ� ����
	}

}