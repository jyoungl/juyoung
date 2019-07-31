
public interface Manager {
	public abstract void add(Person p);
	public abstract boolean remove(Person p);
	public abstract Person[] remove(String name);
	public abstract Person[] search(String name);
	public abstract Person[] search(int rank);
	public abstract void printAll();
}
