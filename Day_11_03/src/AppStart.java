
public class AppStart {
	
	public void run() {
		
		Person p = new Person("ȫ�浿", 20) {//person�� ����� �̸����� Ŭ����
			public void show() {
				System.out.printf("�̸� : %s, ����: %d\n", name, age);
				this.method();
			}
			
			public void method() {
				System.out.println("call method...");
			}
		};
		p.setAge(22);
		p.show();
		//p.method(); // perosn�� method��� �Լ� ���� ������ ������ �� ��
	}
	
	public void main(String[] args) {
		new AppStart().run();
	}
	
	
	
	
//	public void sort(String[] n, int[] k, int[] e, int[] m) {
//		class Student{
//			String name;
//			int kor;
//			int eng;
//			int math;
//			
//			public Student(String name, int kor, int eng, int math) {
//				this.name = name;
//				this.kor = kor;
//				this.eng = eng;
//				this.math = math;
//			}
//		}
//		Student[] s = new Student[n.length];
//		for(int i=0 ; i<s.length ; i++) {
//			s[i] = new Student(n[i], k[i], e[i], m[i]);
//		}
//		���� �迭�� ��ü�� �־ �����ϴ� ��		
//	}
}
