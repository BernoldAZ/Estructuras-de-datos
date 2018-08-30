package structures;

public interface iQueueable {
	
	public <T> void enqueue (T pValue);
	
	public Object dequeue();
	
	public boolean empty();
		
	

}