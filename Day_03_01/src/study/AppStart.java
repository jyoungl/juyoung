package study;

class Person{
	String name; // String -> String이라는 클래스 변수
	int age;
	
	Person(){
		System.out.println("생성자가 호출되었습니다.");
		name = "홍길동";
		age = 20;
	}
	
	void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이: " + age);
	}
}

public class AppStart {
	public static void main(String[] args) {
		student s1 = new student("길동", 1, 80, 1);
		student s2 = new student("심청", 2, 90, 1);
		s1.showInfo();
		s2.showInfo();
				
	}
}
