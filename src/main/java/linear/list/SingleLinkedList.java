package linear.list;


public class SingleLinkedList {
	protected SLLNode 	head;
	
	public void add( SLLNode newNode ) {
		if ( head == null ) {
			head = newNode;
		} else {
			SLLNode prevNode = head;
			
			while ( prevNode.getNext() != null ) {
				prevNode = prevNode.getNext();
			}
			prevNode.setNext( newNode );
		}
	}
	
	public void add(int index,  SLLNode newNode) {
		if ( index < 0 ) return;
		
		if ( head == null ) {
			head = newNode;
		} else {
			if ( index == 0 ) {				
				newNode.setNext( head );
				head = newNode;
			} else {
				SLLNode prevNode = head;
				for (int i=1; i < index ;i++ ) {
					prevNode = prevNode.getNext();
				//	if ( prevNode.getNext() == null ) break;
				}
				newNode.setNext( prevNode.getNext() );
				prevNode.setNext( newNode );
			}
		}
	}

	public boolean remove( int index ) {
		if ( index < 0 ) return false;
		
		if ( head == null ) {
			return false;
		} else {
			if ( index == 0 ) {
				head = head.getNext();
			} else {
				SLLNode prevNode = head;
				for( int i=1; i < index; i++) { // 1번째 index를 삭제할 경우.  loop를 빠져나와서 바로 next처리하면 되자나. 그래서 
					prevNode = prevNode.getNext();
				}
				prevNode.setNext( prevNode.getNext().getNext() );	
			}
		}

		return true;
	}
	
	public Object get( int index ) {
		
		if ( index < 0  ) return null;
		
		if ( head == null ) {
			return null;
		} else {
			SLLNode currentNode = head;
			for ( int i = 0; i < index ; i++ ) {
				currentNode = currentNode.getNext();
			}
			return currentNode.getData();			
		}
	}
	
	
	public String toString() {
		SLLNode currentNode = head;
		
		StringBuffer sb = new StringBuffer();
		
		while ( currentNode != null ) {
			sb.append( currentNode.getData());
			sb.append(", ");
			currentNode = currentNode.getNext();
		}
		if ( sb.length() > 0 ) {
			int i = sb.lastIndexOf(", ");
			sb.delete(i, i +2);
		}
		return new String( "[" + sb.toString()  + "] ");
	}
}
