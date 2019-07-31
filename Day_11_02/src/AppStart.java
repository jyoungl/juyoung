
public class AppStart {
	Outer o;
	
	public AppStart() {
		o = new Outer(10, 20);
	}
	
	public void run() {
		o.show();
		Outer.Inner oi = new Outer.Inner(1000, 2000);
		oi.show();
	}
	
	public static void main(String[] args) {
		new AppStart().run();
	}
}
