
public class IntegerCollection implements Collection {
	public final static int DEFAULT_SIZE = 10;
	public final static int INCREMENT_SIZE = 10;
	private int intArray[];
	private int size;
	private int count;
	private int iSize;
	
	public IntegerCollection() {
		this(DEFAULT_SIZE);
	}
	
	public IntegerCollection(int size) {
		this(size, INCREMENT_SIZE);
	}
	public IntegerCollection(int size, int iSize) {
		this.intArray = new int[size];
		this.size = size;
		this.iSize = iSize;
		this.count = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void add(int value) {
		if(this.count >= this.size) {
			this.size = this.size + this.iSize;
			int[] newArray = new int[this.size + this.iSize];
			for(int i=0 ; i<this.count ; i++) {
				newArray[i] = this.intArray[i];
			}
			this.intArray = newArray;
		}
		this.intArray[this.count] = value;
		this.count++;
	}
	
	public int removeAt(int index) {
		int removeValue = -1;
		if((index >=0 ) && (index < count)) {
			removeValue = this.intArray[index];
			for(int i= index ; i<this.count-1 ; i++) {
				this.intArray[i] = this.intArray[i+1];
			}
			this.count--;
		}
		return removeValue;
	}
	
	public int getAt(int index) {
		if((index >= 0)&&(index<count)){
			return this.intArray[index];
		}
		return -1;
	}
	
	public Iterator iterator() {
		return new IntegerIterator(this);
	}
}
