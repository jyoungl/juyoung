package study;

public class student {
	int number; // �й�
	String name; // �̸�
	int score; // ����
	int rank; // ����
	
	student(String name, int number, int score, int rank){
		this.number=number; // this -> new�� ���� ������� ��ü ����Ŵ 
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
		this.score=score; // this �Ⱦ��� ���� ����� �Ű������� �ν�
	}
	void showInfo() {
		System.out.println("�й� : " + number);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + score);
		System.out.println("���� : " + rank);
	}
}
