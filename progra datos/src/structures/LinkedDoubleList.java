package structures;

public class LinkedDoubleList {
	
	private Node first;
	private Node last;
	private int Length;

	public LinkedDoubleList() {
		first = null;
		last = null;
		Length = 0;
	}
	
	public boolean isEmpty() {
		return Length==0;
	}

	public int getLength() {
		return Length;
	}

	public void add(Object pValue) {
		Node newNode = new Node (pValue);
		
		if (!isEmpty()) {
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;
		} else {
			first = newNode;
			last = newNode;			
		}
		
		this.Length++;
	}
	public void insert (Object pObject) {
		
	}
	public void remove (int pLocation) {
		
	}

}
