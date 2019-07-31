import java.util.ArrayList;
public class AppStart {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(Integer o : a) {
			o += 10;
		}
		
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		al.add(1); al.add(2); al.add(3);
		for(int o : al) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}