import java.util.ArrayList;

public class StudentMagnager implements Manager {
	private ArrayList<Student> students;
	
	public StudentMagnager() {
		this.students = new ArrayList<>();
	}
	@Override
	public void add(Person p) {
		
		try {
			this.students.add((Student)p);
			this.setRank();
		}
		catch(ClassCastException e) {
			try {
				throw new NotstudentException();
			}
			catch(PersonException pe) {
				pe.execute(p);
			}
		}
		
		try {
		if(!(p instanceof Student)) {
			throw new NotstudentException();
			}
		else
			this.students.add((Student)p);
		}
	catch(PersonException e) {
		e.execute(p);
	}
}
	@Override
	public boolean remove(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person[] remove(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] search(int rank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAll() {
		for(int i=0 ; i<students.size(); i++) {
			Student s = students.get(i);
			s.showInfo();
		}
	}

	private void setRank() {
		for(int i=0 ; i<students.size() ; i++) {
			Student is = students.get(i);
			int rank = 0;
			for(int j=0 ; j<students.size(); j++) {
				Student js = students.get(j);
				if(is.getTotal() < js.getTotal()) {
					rank++;
				}
			}
			rank++;
			is.setRank(rank);
		}
	}
}
