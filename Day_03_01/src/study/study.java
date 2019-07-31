package study;

public class study {

	public static void main(String[] args) {
		/*
		 * 규칙 5번 반복
		 * 각 반복시 1씩 증가
		 * 
		 * 규칙 5번 반복
		 * 각 반복시 5에서 1씩 감소
		 * */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("종료");	
		
		
		for(int i=5 ; i>0 ; i--) {
			for(int j=i ; j>0 ; j--) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("종료");
	}
}
