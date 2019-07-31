
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
	System.out.println("중심좌표 : " + xpos + ", " + ypos);
	System.out.println("반지름 : " + radius);
	}

void showInfo(float radius) {
	System.out.println("중심좌표 : " + xpos + ", " + ypos);
	System.out.println("반지름 : " + radius);
	}
}