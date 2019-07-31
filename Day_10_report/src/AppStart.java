import java.util.Scanner;
import java.io.File;

public class AppStart {
	private StudentManager man;
	
	public AppStart() {
		man = new StudentManager();
	}
	
	public void run() throws Exception {
		Scanner osc = new Scanner(new File("data.txt"));
		while(osc.hasNextLine()) {
			Scanner isc = new Scanner(osc.nextLine());
			String name = isc.next();
			int kor = isc.nextInt();
			int eng = isc.nextInt();
			int math = isc.nextInt();
			System.out.println(name + " : " + kor+ " : " + eng + " : " + math);
			man.add(new Student(name, kor, eng, math));
			isc.close();
		}
		osc.close();
		
		Person[] delObjs = man.remove("홍길동");
		System.out.println("삭제된 학생");
		for(Person p : delObjs) {
			p.showInfo();
		}
	
		Person[] sObjs = man.search("홍길동");
		System.out.println("검색된 학생");
		for(Person p : delObjs) {
			p.showInfo();
		}
	
		man.printAll();
}
		public static void main(String[] args) throws Exception {
		AppStart app = new AppStart();
		app.run();
	}
}
