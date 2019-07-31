
public class Book {
	private static int count = 0;
	private String name;
	private int price;
	
	public static int getCount() {
		return count;
	}
	
	Book(String name, int price){
		this.name = name;
		this.price =price;
		count++;
	}
	
	Book(Book b){
		this(b.name, b.price);
	}
	
	public Book copy() {
		return new Book(this.name, this.price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void showInfo() {
		System.out.println(this.name + " : " + this.price + "¿ø");
	}
}
