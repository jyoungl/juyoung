package study;

public class study {

	public static void main(String[] args) {
		/*
		 * ��Ģ 5�� �ݺ�
		 * �� �ݺ��� 1�� ����
		 * 
		 * ��Ģ 5�� �ݺ�
		 * �� �ݺ��� 5���� 1�� ����
		 * */
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("����");	
		
		
		for(int i=5 ; i>0 ; i--) {
			for(int j=i ; j>0 ; j--) {
				System.out.println("*");
			}
			System.out.println();
		}
		System.out.println("����");
	}
}
