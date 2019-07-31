class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}


public int hashCode() {
	final int prime= 31;
	int result =1;
	
	result = prime * result * this.name.hashCode();
}

public class AppStart {
	public void main(String[] args) {
		
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("ȫ�浿", 20);
		
		System.out.println(p1 == p2); // �ν��Ͻ� ��
		System.out.println(p1.equals(p2)); // ���� ��
	}
}