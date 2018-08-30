package structures;

public class Stack extends LinkedDoubleList implements structures.iStackable{
	Node top;
	
	public Stack() {
		top = null;
	}
	
	public boolean empty() {
		return super.isEmpty();
	}
	
	public void push( Object pObject) {
		this.insert(pObject,0);		
	}
	
	public Object pop () {
		Object value = this.get(0);
		this.delete(0);
		return value;
	}

}

