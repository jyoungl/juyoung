
public class AppStart {
	public static void main(String[] args) {
		Student gildong = new Student("ȫ�浿" , 10000);
		bus bus1 = new bus(10, 1, 1000);
		
		if(bus1.inCustomer(gildong)) {
			System.out.println(gildong.getName()+ "�л��� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println(gildong.getName() + "�л��� �������� ���߽��ϴ�.");
		}
		
		if(gildong.rideBus(bus1)) {
			System.out.println(gildong.getName()+ "�л��� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println(gildong.getName()+ "�л��� �������� ���߽��ϴ�..");
		}
		
		gildong.showInfo();
		bus1.showInfo();
	}
}
