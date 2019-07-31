
public class AppStart {
	Outer o;
	
	public AppStart(){
		o = new Outer(10, 20);
	}
	
	public void run() {
		o.show();
		Outer.Inner oi = o.new Inner(1000, 2000);
		oi.show();
		o.setX(50);
		o.setY(500);
		o.show();
		oi.show();
	}
	
	public static void main(String[] args) {
		(new AppStart()).run();
	}
}