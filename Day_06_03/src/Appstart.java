class Poly {
	int x;
	int y;
	
	Poly(int x, int y){
		System.out.println("Call Poly()");
		this.x = x;
		this.y = y;
	}
}

class Circle extends Poly{
	int x, y;
	Circle(int x, int y){
		super(x, y);
		//super(); // ����Ŭ���� ����Ʈ������ ȣ���ϰ� ��
		//System.out.println("Call Circle()");
	}
	
	public void show() {
		System.out.println(super.x + " : " + super.y);
	}
}

public class Appstart {
	public static void main(String[] args) {
		Circle c = new Circle(100, 200);
		c.show();
	}
}