package structures;

public class LinkedDoubleList<T> {
	
	private Node<T> first;
	private Node<T> last;
	private int Length;
	
	public LinkedDoubleList() {
		first = null;
		last = null;
		Length = 0;
	}
	
	public boolean isEmpty() {
		return first == null; 
	}
	

	public int getLength() {
		return Length;
	}

	public void add(T pValue) {
		Node<T> newNode = new Node<T> (pValue);
		
		if (!isEmpty()) {
			last.setNext(newNode);
			newNode.setPrevious(last);
			last = newNode;
			last.setNext(first);
			first.setPrevious(last);
			
		} else {
			first = newNode;
			last = newNode;	
			last.setNext(first);
			first.setPrevious(last);
			
		}
		
		this.Length++;
	}
	
	public void insert(T pValue,int i) {
		if(isEmpty()) {
			add(pValue);
			return;
		}
		Node<T> temp = first;
		for(int c = 0 ; c < getLength() ; c++) {
			if(c == i) {
				Node<T> newNode = new Node<T> (pValue, temp.getPrevious(), temp);
				temp.setPrevious(newNode);
				newNode.getPrevious().setNext(newNode);
				if (i == 0) first = newNode;
				if (i == getLength()-1) last = newNode;
				break;
			}
			temp = temp.getNext();	
		}
	}
	public T get(int i) {
		Node<T> temp = first;
		for(int c = 0 ; c < getLength() ; c++) {
			if(c == i) {
				return temp.getValue();
			}
			temp = temp.getNext();
		}
		return null;
	}
	public void delete(int i) {
		Node<T> temp = first;
		for(int c = 0 ; c < getLength() ; c++) {
			if(c == i) {
				if(i == 0) {
					first = temp.getNext();
				}else if (i == getLength()-1) {
					last = temp.getPrevious();
				}
				temp.getPrevious().setNext(temp.getNext());
				temp.getNext().setPrevious(temp.getPrevious());
				temp.setPrevious(null);
				temp.setNext(null);
			}
			temp = temp.getNext();
		}
	}
}

