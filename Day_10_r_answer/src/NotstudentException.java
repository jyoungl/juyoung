
public class NotstudentException extends PersonException {

	public NotstudentException() {
		super("�ش� ��ü�� Student Ŭ������ �ν��Ͻ��� �ƴմϴ�.");
	}

	public void execute(Person p) {
		System.out.println(getMessage());
		System.out.println("���⿡ ����ó�� ������ �μ���.");
	}

}
