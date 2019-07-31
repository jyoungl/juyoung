
public class Car {
	private String vender;
	private String name;
	private int price;
	private String color;
	private String fuel;
	
	public Car(String vender, String name, int price, String color, String fuel) {
		this.vender = vender;
		this.name = name;
		this.price = price;
		this.color = color;
		this.fuel = fuel;
	}
	
	public void setVender(String vender) {this.vender = vender;}
	public void setName(String name) {this.name = name;}
	public void setPrice(int price) {this.price = price;}
	public void setColor(String color) {this.color = color;}
	public void setFuel(String fuel) {this.fuel = fuel;}
	public String getVender() {return this.vender;}
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getColor() {return this.color;}
	public String getFuel() {return  this.fuel;}
	
	public void showInfo() {
		System.out.println("������ : "+ this.vender);
		System.out.println("�𵨸� : "+ this.name);
		System.out.println("�ǸŰ� : "+ this.price + "����");
		System.out.println("���� : "+ this.color);
		System.out.println("���� : "+ this.fuel);
	}
}