package study;

class Person{
	String name; // String -> String�̶�� Ŭ���� ����
	int age;
	
	Person(){
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
		name = "ȫ�浿";
		age = 20;
	}
	
	void show() {
		System.out.println("�̸� : " + name);
		System.out.println("����: " + age);
	}
}

public class AppStart {
	public static void main(String[] args) {
		student s1 = new student("�浿", 1, 80, 1);
		student s2 = new student("��û", 2, 90, 1);
		s1.showInfo();
		s2.showInfo();
				
	}
}
