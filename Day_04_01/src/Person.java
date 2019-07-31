//private package protected public <- 접근제한자
public class Person {
	private String name;
	private int score;
	private int rank;
	
	public Person() {
		
	}
	
	public Person(String name, int score, int rank) {
		this.name=name;
		this.score=score;
		this.rank=rank;
	}
	
	public Person(String name, int score) {
		this(name, score, 1);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setScore(int score) {
		if(score<0 || score>100)
			this.score = 0;
		else
			this.score=score;
	}
	
	public void setRank(int rank) {
		if(rank<1)
			this.rank = 100;
		else
			this.rank = rank;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int setScore() {
		return this.score;
	}
	
	public int setRank() {
		return this.rank;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("점수 : " + this.score);
		System.out.println("순위 : " + this.rank);
	}
}
