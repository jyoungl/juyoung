
public class Circle {
	int xpos;
	int ypos;
	float radius;

Circle(int xpos, int ypos, float radius){
	this.xpos=xpos;
	this.ypos=ypos;
	this.radius=radius;
}

Circle() {
	this(10, 10, 0.0F);
}

void showInfo() {
	System.out.println("�߽���ǥ : " + xpos + ", " + ypos);
	System.out.println("������ : " + radius);
	}

void showInfo(float radius) {
	System.out.println("�߽���ǥ : " + xpos + ", " + ypos);
	System.out.println("������ : " + radius);
	}
}