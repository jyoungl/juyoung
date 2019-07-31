
public class Outer {
	private int ox;
	private int oy;
	private Inner i;
	
	public Outer(int  x, int y) {
		ox = x;
		oy = y;
		i = new Inner(100, 200);
	}
	
	class Inner {
		public int MAX = 100;
		private int ix;
		private int iy;
		
		public Inner(int x, int y) {
			ix = x;
			iy = y;
		}
		
		public void show() {
			System.out.printf("%7d%7d%7d%7d\n",ox, oy, ix, iy);
		}
	}
	
	public void setX(int x) { ox = x; }
	public void setY(int y) { oy = y; }
	public int getX() { return ox; }
	public int getY() { return oy; }
	
	public void show() {
		i.show();
	}
}