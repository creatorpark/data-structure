package linear.list.poly;

import java.util.ArrayList;

public class PolyLinkedList {

	private PLLNode head;
	
	public void add( PLLNode newNode ) {
		if ( head == null ) {
			head = newNode; 
		} else {
			PLLNode currentNode = head;
			
			while( currentNode.getNext() != null ) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext( newNode );
		}
	}
	
	public PolyLinkedList addPoly( PolyLinkedList polyLinkedList ) {
		PolyLinkedList result = new PolyLinkedList();
		PLLNode cursorA = head;
		PLLNode cursorB = polyLinkedList.get(0);
		PLLNode newNode = null;
		while ( cursorA != null && cursorB !=null ) {
			if ( cursorA.exponent == cursorB.exponent ) {
				newNode = new PLLNode(cursorA.coefficient + cursorB.coefficient, cursorA.exponent );
				cursorA = cursorA.getNext();
				cursorB = cursorB.getNext();
				result.add( newNode );
			} else if ( cursorA.exponent > cursorB.exponent ) {
				newNode = new PLLNode(cursorA.coefficient , cursorA.exponent );
				cursorA = cursorA.getNext();
				result.add( newNode );
			} else if ( cursorA.exponent < cursorB.exponent ) {
				newNode = new PLLNode(cursorB.coefficient , cursorB.exponent );
				cursorB = cursorB.getNext();				
				result.add( newNode );
			}
		}
		while ( cursorA != null ) { 
			result.add(cursorA);
			cursorA = cursorA.getNext();
		}
		
		while ( cursorB != null ) {
			result.add(cursorB);
			cursorB = cursorB.getNext();
		}
		return result;
	}
	
	public PLLNode get(int index ) {		
		if ( index < 0 ) return null;
		
		PLLNode currentNode = head;
		if ( index == 0 ) {
			return currentNode;
		} else {
			for(int i=1; i <= index;i++) {
				currentNode = currentNode.getNext();
			}
			return currentNode;
		}
	}
	
	public String toString() {
		PLLNode currentNode = head;
		StringBuffer sb = new StringBuffer();
		while ( currentNode != null ) {
			sb.append( currentNode.toString() );
			if ( currentNode.getNext() != null ) {
				sb.append(" + " );	
			}
			currentNode = currentNode.getNext();
			ArrayList<String> a = new ArrayList<String>();
		}
		return sb.toString();
	}
}

