class Bird {
	String name;
	
	public void showInfo() {
		System.out.println("이름 : " + name);
	}
}

class Duck extends Bird {
	
}

public class AppStart {

	public static void main(String[] args) {
		Bird bird = new Bird();
		Bird duck = new Duck();
		
		bird.name = "새";
		duck.name = "오리";
		
		bird.showInfo();
		duck.showInfo();
	}
}
