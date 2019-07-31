
abstract class Character {
	String name;
	
	public Character(String name) {
		this.name = name;
	}
	
	public final void move(int a) {
		final int a = 10;
		System.out.println("캐릭터가 이동합니다.");
	}
	
	public abstract void fight(); // 반드시 상속된 곳에서 재정의
}