
public class Person implements Cloneable, Comparable<Person> {
		private String name;
		private int id;
		
		public int compareTo(Person o) {
			return (this.id - o.id);
		}
		
		public Object clone() throws CloneNotSupportedException{
			Object o = super.clone();
			Person p = (Person)o;
			p.name = new String(this.name);
			p.id = this.id;
			return p;
		}
		
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			
			result = prime * result * ( (this.name==null) ? 1 : this.name.hashCode());
			result = prime * result * this.id;
			
			return result;
		}
		
		public boolean equals(Object o) {
			if(o == null) return false;
			if(!(o instanceof Person)) return false;
			Person obj = (Person)o;
			if(this.name == null) {
				if(obj.name != null)return false;
			}
			else {
				if(!(this.name.equals(obj.name)))return false;
			}
			if(this.id != obj.id)return false;
			return true;
		}

		public Person(String name, int id) {
			this.name = name;
			this.id = id;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getId() {
			return this.id;
		}
		
		public String toString() {
			return "ID : " + this.id + " 이름 : " + this.name;
		}
		
		public void show() {
			System.out.println("ID : " + this.id + " 이름 : " + this.name);
		}
}
