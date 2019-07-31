
public class AppStart {
	public static void main(String[] args) {
		Student gildong = new Student("홍길동" , 10000);
		bus bus1 = new bus(10, 1, 1000);
		
		if(bus1.inCustomer(gildong)) {
			System.out.println(gildong.getName()+ "학생이 승차하였습니다.");
		}
		else {
			System.out.println(gildong.getName() + "학생이 승차하지 못했습니다.");
		}
		
		if(gildong.rideBus(bus1)) {
			System.out.println(gildong.getName()+ "학생이 승차하였습니다.");
		}
		else {
			System.out.println(gildong.getName()+ "학생이 승차하지 못했습니다..");
		}
		
		gildong.showInfo();
		bus1.showInfo();
	}
}
