import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	public static final int MAX = 10;
	private ArrayList<Student> students;
	
	public Manager() {
		this.students = new ArrayList<Student>();
	}
	
	public boolean add(Student student) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		if(students.isEmpty())
			return false;
		
		for(int i=0 ; i<students.size(); i++) {
			if(students.get(i).getName() == s)
				return false;
			}
		int kor = input.nextInt();
		int eng = input.nextInt();
		int math = input.nextInt();
		students.add(new Student(s, kor, eng, math));
		setRank();

		return true;
	}
	
	public Student search(String name) {
		for(int i=0 ; i<students.size(); i++)
			if(students.get(i).getName() == name)
				return students.get(i);
			else
				return null;//못찾으면 널, 찾으면 객체 반환
		return null;
	}
	
	public void remove(String name) {
		for(int i=0 ; i<students.size(); i++)
			if(students.get(i).getName() == name)
				students.remove(name);
	}
	
	public void printList() {
		for(int i=0;i<students.size();i++)
			students.get(i).showInfo();
	}
	
	public void setRank() {
		int r=0;
		for(int i=0 ; i<students.size()-1 ; i++)
			if(students.get(students.size()).getTotal() < students.get(i).getTotal())
				r++;
		students.get(students.size()).setRank(r+1);
			
	}
}
