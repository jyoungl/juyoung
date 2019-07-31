
public final class Student extends Person {
	private String grade;
	private int kor;
	private int eng;
	private int math;
	private int rank;
	
	public Student(String name, String grade, int kor, int eng, int math) {
		super(name);
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.rank = 0;
	}
	
	public void setGrade(String grade) {
		this.grade= grade;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {this.eng=eng;}
	public void setMath(int math) {this.math = math;}
	public void setRank(int rank) {this.rank=rank;}
	public String getGrade() {return this.grade;}
	public int getKor() {return this.kor;}
	public int getEng() {return this.eng;}
	public int getMath() {return this.math;}
	public int getRank() {return this.rank;}
	public int getTotal() {return(this.kor+this.eng+this.math);}
	public double getAvg() {return (this.getTotal()/3.0);}
	
	public int compareTo(Object o) {
		return (((Student)o).getTotal() - this.getTotal());
	}
	
	public void showInfo() {
		System.out.println("------" + this.name + "------");
		System.out.println("학과 : " + this.grade);
		System.out.printf("국어 : %6d\n", this.kor);
		System.out.printf("영어 : %6d\n", this.eng);
		System.out.printf("수학 : %6d\n", this.math);
		System.out.printf("총점 : %6d\n", this.getTotal());
		System.out.printf("평균 : %6.2f\n", this.getAvg());
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof Student)) return false;
		if(!super.equals(o)) return false;
		Student s = (Student)o;
		if(this.grade != null) {
			if(s.grade != null) return false;
		}
		else {
			if(!this.grade.equals(s.grade)) return false;
		}
		if(this.kor != s.kor)return false;
		if(this.eng != s.eng)return false;
		if(this.math != s.math)return false;
		if(this.rank != s.rank)return false;
		
		return true;
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * (result + ((grade == null) ? 1 : grade.hashCode()));
		result = prime * (result + this.kor);
		result = prime * (result + this.eng);
		result = prime * (result + this.math);
		result = prime * (result + this.rank);
		return result;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Object o = super.clone();
		Student s = (Student)o;
		s.grade = new String(this.grade);
		s.kor = this.kor;
		s.eng = this.eng;
		s.math = this.math;
		s.rank = this.rank;
		return o;
	}
}