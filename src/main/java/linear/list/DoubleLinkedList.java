package linear.list;


/**
 * LinkedList에서 확장되는 지점만 따로 잘 정리한다.
 * @author creatorpark
 *
 */
public class DoubleLinkedList {
	private DLLNode 		head;

	public void add( DLLNode newNode ) {
		if ( head == null ) {
			head = newNode;
		} else {
			DLLNode currentNode = head;
			while ( currentNode.getNext() != null ) {
				currentNode = currentNode.getNext();
			}
			newNode.setPrev( currentNode );
			currentNode.setNext( newNode );
			
		}
	}
	
	public void add(int index,  DLLNode newNode) {
		if ( head == null ) {
			head = newNode;
		} else {
			if ( index == 0 ) {				
				newNode.setNext( head );
				head.setPrev( newNode );
				head = newNode;
			} else {
				DLLNode currentNode = head;
				for (int i=1; i < getlastIndex(index) ;i++ ) {
					currentNode = currentNode.getNext();
				}
				newNode.setPrev( currentNode );
				newNode.setNext( currentNode.getNext() );
				currentNode.setNext( newNode );
			}
		}
	}
	
	public boolean remove( int index ) {
		DLLNode currentNode = head;
		
		if ( index < 0 ) return false;
		if ( index > getlastIndex(index)  ) return false;
		
		if ( index == 0 ) {
			head = currentNode.getNext();
			head.setPrev(null);
		} else {
			for( int i=1; i < index; i++) { // i는 1회이다. index 이전까지만 가니까 되는구나.
				currentNode = currentNode.getNext();
			}
			DLLNode nextNode = currentNode.getNext().getNext();
			nextNode.setPrev( currentNode );
			currentNode.setNext( nextNode );	
		}

		return true;
	}
	
	public Object get(int index ) {
		DLLNode currentNode = head;
		
		if ( index < 0  ) return null;
		if ( index >  getlastIndex(index) ) return null;
		
		for ( int i = 0; i < index ; i++ ) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}
	
	public int getSize() {
		int size = 0;
		DLLNode currentNode = head;
		while ( currentNode != null ) {
			size++;
			currentNode = currentNode.getNext();
		}
		return size;
	}
	
	public int getlastIndex(int index) {
		int lastIndex = index;
		if ( (getSize() - 1) < index ) lastIndex = getSize() -1;
		return lastIndex;
	}
	
	public String toString() {
		DLLNode current = head;
		
		StringBuffer sb = new StringBuffer();
		
		while ( current != null ) {
			sb.append( current.getData());
			sb.append(", ");
			current = current.getNext();
		}
		if ( sb.length() > 0 ) {
			int i = sb.lastIndexOf(", ");
			sb.delete(i, i +2);
		}
		return new String( "[" + sb.toString()  + "], " + getSize());
	}
}
