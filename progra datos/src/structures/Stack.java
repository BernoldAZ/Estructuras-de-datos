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
		this.insert(pObject);		
	}
	
	public Object pop () {
		this.remove(0);
	}
}
