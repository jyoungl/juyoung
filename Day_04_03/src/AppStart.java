class Student{
	static int count; // ��� ��ü�� �����ؼ� ���, Ŭ���� ������ ������ ��Ģ(��ü �����ε� ������ ����)
	String name;
	
	static { // static �ʵ�
		System.out.println("static �ʵ� ȣ��");
		count = 0;
	}
	
	public Student(String name) {
		System.out.println(name + "������ȣ��");
		this.name = name;
		this.count++;
	}
	
	public void showInfo() {
		System.out.println("�л��̸� : " + name);
		System.out.println("�л� �� : " + count);
	}
	
	public static void showStaticInfo() {
		System.out.println("Call showStaticInfo()");
	} // static�̴� ��ü ���� Ŭ���� ������ ȣ�� ����
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
		Student s1 = new Student("ȫ�浿");
		s1.showStaticInfo(); // s1�����ϰԵ�. s1�� Ÿ�� student�� ȣ��
		s1.count = 200;
		s1.showInfo();
//		Student s2 = new Student("��û��");
//		s1.showInfo();
//		s2.showInfo();
	}
}
