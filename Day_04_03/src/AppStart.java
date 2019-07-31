class Student{
	static int count; // ¸ğµç °´Ã¼°¡ °øÀ¯ÇØ¼­ »ç¿ë, Å¬·¡½º ¸íÀ¸·Î Á¢±ÙÀÌ ¿øÄ¢(°´Ã¼ ¸íÀ¸·Îµµ Á¢±ÙÀº °¡´É)
	String name;
	
	static { // static ÇÊµå
		System.out.println("static ÇÊµå È£Ãâ");
		count = 0;
	}
	
	public Student(String name) {
		System.out.println(name + "»ı¼ºÀÚÈ£Ãâ");
		this.name = name;
		this.count++;
	}
	
	public void showInfo() {
		System.out.println("ÇĞ»ıÀÌ¸§ : " + name);
		System.out.println("ÇĞ»ı ¼ö : " + count);
	}
	
	public static void showStaticInfo() {
		System.out.println("Call showStaticInfo()");
	} // staticÀÌ´Ï °´Ã¼ ¾øÀÌ Å¬·¡½º ¸íÀ¸·Î È£­ƒ °¡´É
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
		Student s1 = new Student("È«±æµ¿");
		s1.showStaticInfo(); // s1¹«½ÃÇÏ°ÔµÊ. s1ÀÇ Å¸ÀÔ student·Î È£Ãâ
		s1.count = 200;
		s1.showInfo();
//		Student s2 = new Student("½ÉÃ»ÀÌ");
//		s1.showInfo();
//		s2.showInfo();
	}
}
