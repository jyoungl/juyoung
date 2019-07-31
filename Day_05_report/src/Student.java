
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int rank = 0;
	
	public Student(String s, int kor, int eng, int math) {
		this.name = s;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getName() {
		return this.name;
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
	
	public int getTotal() {
		int total;
		total = this.kor + this.eng + this.math;
		return total;
	}
	
	public double getAvg() {
		double avg;
		avg = this.getTotal()/3;
		return avg;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.math);
		System.out.println("등수 : " + this.rank);
	}
}
