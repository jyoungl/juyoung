
public class AppStart {
	public static void main(String[] args) {
		Book b1 = new Book("홍길동전", 20000);
		//Book b2 = b1; // 같은 인스턴스를 가리킴  <- 식별자 복사(옅은 복사)
		//Book b2 = new Book(b1); // b1의 값 복사
		//Book b2 = b1.copy(); 위에거랑 동일
		Book b = new Book("...", 1000);
		
		Book[] books = new Book[3];
		books[0] = new Book("홍길동전", 2000);
		books[1] = new Book("권력이동", 2500);
		books[2] = new Book("제2의물결", 3000);
		
		Book[] books2 = new Book[3];
		for(int i=0 ; i<books.length ; i++)
			books2[i] = books[i].copy(); // 인스턴스 복제
	}

}