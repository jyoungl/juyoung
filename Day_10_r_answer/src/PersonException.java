
public abstract class PersonException extends Exception {
	public PersonException(String message) {
		super(message);
	}
	
	public abstract void execute(Person p);
}
