package structures;

public class Queue extends LinkedDoubleList implements structures.iQueueable{
	Node first;
	Node last;
	int priority;
	
	public Queue() {
		first = null;
		last = null;
	}
	
	public boolean empty() {
		return super.isEmpty();
	}
	
	public Object dequeue() {
		Object value = this.get(0);
		this.delete(0);
		return value;	
	}
	
	public void enqueue (Object pObject) {
		this.add(pObject);
	}
}

