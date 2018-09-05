package structures;

public class Stack<T> extends LinkedDoubleList implements structures.iStackable{
	Node top;
	
	public Stack() {
		top = null;
	}
		
	public Object pop () {
		Object value = this.get(0);
		this.delete(0);
		return value;
	}

	public <T> void push(T pValue) {
		this.insert(pValue,0);	
		
	}

}

