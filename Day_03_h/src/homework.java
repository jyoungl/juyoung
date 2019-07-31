
public class homework {
	public static void main(String[] args) {
		for(int i=5 ; i>0 ; i--) {
			int a=i;
			for(int j=1 ; j<6 ; j++) {
				if(a!=j)
					System.out.print(" ");
				else if(a==j){
					System.out.print("*");
					a++;
					}
			}
			System.out.println();
		}
		
		int star = 3;
		int scount = 1;
		for(int i=0 ; i<3 ; i++) {
			for(int j=1 ; j<star ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<scount ; j++) {
				System.out.print("*");
			}
			for(int j=0 ; j<star ; j++) {
				System.out.print(" ");
			}
			star-=1;
			scount+=2;
			System.out.println();
		}
	}
}
