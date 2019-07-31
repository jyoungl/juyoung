
public class IntegerIterator implements Iterator {
	private IntegerCollection collection;
	private int index;
	
	public IntegerIterator(Collection collection) {
		this.collection = (IntegerCollection)collection;
		this.index = 0;
	}
	
	public boolean hasNext() {
		if(index < this.collection.getCount()){
			return true;
		}
		return false;
	}
	
	public Object next() {
		Integer i = this.collection.getAt(index);
		this.index++;
		return i;
	}
	
	public void rewind() {
		this.index = 0;
	}
}
