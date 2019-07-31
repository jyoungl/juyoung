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
		
		Person[] delObjs = man.remove("ȫ�浿");
		System.out.println("������ �л�");
		for(Person p : delObjs) {
			p.showInfo();
		}
	
		Person[] sObjs = man.search("ȫ�浿");
		System.out.println("�˻��� �л�");
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
