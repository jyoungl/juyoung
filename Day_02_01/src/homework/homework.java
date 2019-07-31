package homework;

public class homework {

	public static void main(String[] args) {
		byte b = 0;
		
		b=(byte)(b|0B10000000);
		//1¹øÆÒ °³¹æ  b=00000000 -> 10000000
		System.out.print(b);
		System.out.println();
		
		b=(byte)~b;
		//ÀüÃ¼ ÆÒ Åä±Û  b=10000000 -> 01111111
		System.out.print(b);
		System.out.println();
		
		b=(byte)(b&0B01011111);
		//3¹øÆÒ Æó¼â   b=01111111 -> 010111111
		System.out.print(b);
		System.out.println();
		
		int Bin=0;
		
		for(int i=0 ; i<8 ; i++) {
			int c;
			c = b%2;
			b/=2;
			Bin=(int)(Bin+c*Math.pow(10, i));
		}
		System.out.print(Bin);
		
	}

}
