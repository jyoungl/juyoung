
public class PetHospital implements IHospital {
	
	public boolean operator(Operand op) {
		if(!(op instanceof Pet)) {
			System.out.println("동물이 아님...");
			return false;
		}
		if(op.getState()) {
			System.out.println("과잉진료");
			return false;
		}
		
		op.setState(true);
		System.out.println("수술이 완료됨");
		op.showInfo();
		
		return true;
	}
}
