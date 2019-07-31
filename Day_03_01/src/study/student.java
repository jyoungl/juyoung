package study;

public class student {
	int number; // 학번
	String name; // 이름
	int score; // 점수
	int rank; // 순위
	
	student(String name, int number, int score, int rank){
		this.number=number; // this -> new에 의해 만들어진 객체 가리킴 
		this.name=name;
		this.score=score;
		this.rank=rank;
	}
	
	void study() {
		score += 10;
		if(score>100) {
			score = 100;
		}
	}
	
	void setScore(int score) {
		this.score=score; // this 안쓰면 가장 가까운 매개변수로 인식
	}
	void showInfo() {
		System.out.println("학번 : " + number);
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + score);
		System.out.println("순위 : " + rank);
	}
}
