class Bird {
	String name;
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
	}
}

class Duck extends Bird {
	
}

public class AppStart {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Bird duck = new Duck();
		
		bird.name = "��";
		duck.name = "����";
		
		bird.showInfo();
		duck.showInfo();
	}
}
