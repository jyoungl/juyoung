
public class AppStart {
	public static void main(String[] args) {
		IHospital ph = new PetHospital();
		Operand cat = new Pet();
		Human man = new Human();
		
		cat.showInfo();
		man.showInfo();
		
		ph.operator(cat);
		ph.operator(man);
	}
}
