class Student{
	static int count; // 모든 객체가 공유해서 사용, 클래스 명으로 접근이 원칙(객체 명으로도 접근은 가능)
	String name;
	
	static { // static 필드
		System.out.println("static 필드 호출");
		count = 0;
	}
	
	public Student(String name) {
		System.out.println(name + "생성자호출");
		this.name = name;
		this.count++;
	}
	
	public void showInfo() {
		System.out.println("학생이름 : " + name);
		System.out.println("학생 수 : " + count);
	}
	
	public static void showStaticInfo() {
		System.out.println("Call showStaticInfo()");
	} // static이니 객체 없이 클래스 명으로 호춢 가능
}

class Bus{
	static final int MAX = 10;
	final static int MIN = 5;
	static int a = 10;
	final int b = 20;
}

public class AppStart {
	public static void main(String[] args) {
		Student.showStaticInfo();
		Student s1 = new Student("홍길동");
		s1.showStaticInfo(); // s1무시하게됨. s1의 타입 student로 호출
		s1.count = 200;
		s1.showInfo();
//		Student s2 = new Student("심청이");
//		s1.showInfo();
//		s2.showInfo();
	}
}
