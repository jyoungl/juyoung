
public class AppStart {
	
	public void run() {
		
		Person p = new Person("홍길동", 20) {//person을 상속한 이름없는 클래스
			public void show() {
				System.out.printf("이름 : %s, 연령: %d\n", name, age);
				this.method();
			}
			
			public void method() {
				System.out.println("call method...");
			}
		};
		p.setAge(22);
		p.show();
		//p.method(); // perosn에 method라는 함수 없기 때문에 승인이 안 남
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
//		여러 배열을 객체에 넣어서 정렬하는 법		
//	}
}
