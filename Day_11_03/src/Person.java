
public class Person {
		String name;
		int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void setName(String name) {this.name = name;}
		public String getName() {return this.name;}
		public void setAge(int age) {this.age = age;}
		public int getAge() {return this.age;}
		void show() {
			System.out.printf("%10s%5d", name, age);
		}
}
