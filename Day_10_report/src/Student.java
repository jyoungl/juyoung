import java.util.Iterator;

public class Student extends Person{
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private int rank = 0;
	
	public Student(String name, int kor, int eng, int math) {
		super(name);
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void Math(int math) {
		this.math = math;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public boolean equals(Object o) {
		if(o==null) return false;
		else if(!(o instanceof Student)) return false;
		
		Student ps = (Student)o;
		if(this.name == null) {
			if(ps.name != null) return false;}
		else {
			if(!(this.name.equals(ps.name)))return false;
		}
		if(this.rank != ps.rank) return false;
		return true;
	}
	
	public int hashCode() {
		return rank;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Object o = this.clone();
		Student s = (Student)o;
		s.name = new String(this.name);
		s.kor = this.kor;
		s.eng = this.eng;
		s.math = this.math;
		s.rank = this.rank;
		
		return s;
		
	}
	
	public int compareTo(Student o) {
		return((this.rank - o.rank)*(-1));
	}
	
	public void showInfo() {
		System.out.println("이름" + this.name + 
							" 국어" + this.kor +
							" 영어" + this.eng +
							" 수학" + this.math+
							" 등수" + this.rank);
	}
}
