
public class Outer {
	int x;
	int y;
	static int z = 10;
	Inner i;
	
	public Outer(int x, int y) {
		this.x = x;
		this.y = y;
		i = new Inner(100, 200);
	}
	
	public static class Inner {
		private int i;
		private int j;
		public static int k = 100;
		
		public Inner(int i, int j) {
			this.i = i;
			this.j = j;
		}
		
		public void show() { // x,y 쓰기 불가
			System.out.println("z : " + z);
			System.out.println("i : " + i);
			System.out.println("j : " + j);
			System.out.println("k : " + k);
		}
	}
	
	public void show() {
		i.show();
	}
}
