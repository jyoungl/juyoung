
public class AppStart {

	public static void main(String[] args) {
		byte a = -128;
		int op = 1 << 7; // int op = 0x8000000;
		
		for(int i=0 ; i<8 ; i++) {
			if((a & op) !=0 )
				System.out.print(1);
			else
				System.out.print(0);
			op >>>= 1;
		}
		System.out.print(" ");
	}
}