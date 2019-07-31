
public interface Manager {
	
	public void add(Person p);
	
	public boolean remove(Person p);
	
	public Person[] remove(String name);
	
	public Person[] search(String name);
	
	public Person[] search(int rank);
	
	public void printAll();
}
