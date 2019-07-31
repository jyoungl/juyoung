
public class AppStart {
	public static void main(String[] args) {
		IntegerCollection c = new IntegerCollection(5, 3);
		System.out.println("현재 데이터 수 : " +c.getCount());
		System.out.println("현재 공간크기 : " +c.getSize());
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.add(6);
		System.out.println("현재 데이터 수 : " +c.getCount());
		System.out.println("현재 공간크기 : " +c.getSize());
		c.removeAt(4);
		System.out.println("현재 데이터 수 : " +c.getCount());
		System.out.println("현재 공간크기 : " +c.getSize());
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		it.rewind();
	}
}
