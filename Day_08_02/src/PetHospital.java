
public class PetHospital implements IHospital {
	
	public boolean operator(Operand op) {
		if(!(op instanceof Pet)) {
			System.out.println("������ �ƴ�...");
			return false;
		}
		if(op.getState()) {
			System.out.println("��������");
			return false;
		}
		
		op.setState(true);
		System.out.println("������ �Ϸ��");
		op.showInfo();
		
		return true;
	}
}
