package structures;

public class Node {
	private Object value;
	private Node next;
	private Node previous;
	
	public Node() {
		next = null;
	}
	
	public Node(Object pValue) {
		this();
		value = pValue;
	}

	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	

}
