import java.util.Scanner;

public class AppStart {
	private Scanner sc;
	private Manager manager;
	
	public AppStart() {
		sc = new Scanner(System.in);
		manager = new StudentMagnager();
	}
	
	public int getNumber(String message) {
		int number = 0;
		
		while(true) {
			System.out.print(message + " : ");
			
			if(sc.hasNextInt()) {
				number = sc.nextInt();
				
				if(sc.hasNextLine()) {
					sc.nextLine();
				break;
				}
			}
			if(sc.hasNextLine()) {
				sc.nextLine();
			}
		}
		return number;
	}
	
	public String getString(String message) {
		System.out.print(message + " : ");
		return sc.nextLine();
	}
	
	public static void main(String[] args) throws Exception {
		AppStart app = new AppStart();
		int num = app.getNumber("�������� ");
		System.out.println("�Էµ� �� : " + num);
		String name = app.getString("�̸��Է� ");
		System.out.println("�Էµ� �̸�" + name);
	}
}
