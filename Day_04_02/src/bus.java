
public class bus {
	private int number;
	private int rate; // ����
	private int per; // �������
	public final int MAX;
	private int count;
	
	public bus(int MAX, int number, int per) {
		this.number = number;
		this.rate = 0;
		this.per = per;
		this.MAX = MAX;
		this.count = 0;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public void setPer(int per) {
		this.per = per;
	}
	
	public void setCount() {
		this.count += 1;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int getRate() {
		return this.rate;
	}

	public int getPer() {
		return this.per;
	}
	
	public void showInfo() {
		System.out.println(this.number + "�� ���� : " + this.rate);
		System.out.println(this.count + " ���� ž���߽��ϴ�.");
	}
	
	public boolean inCustomer(Student s) {
		if(s.getRate() >= this.per) {
			s.setRate(s.getRate()-this.per);
			this.rate += this.per;
			s.setCount();
			this.count += 1;
			return true;
		}
		return false;
			
	}
}
