
public class NotstudentException extends PersonException {

	public NotstudentException() {
		super("해당 객체는 Student 클래스의 인스턴스가 아닙니다.");
	}

	public void execute(Person p) {
		System.out.println(getMessage());
		System.out.println("여기에 예외처리 구문을 두세요.");
	}

}
