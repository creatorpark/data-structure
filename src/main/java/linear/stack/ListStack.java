package linear.stack;

import linear.list.SLLNode;

public class ListStack {

	SLLNode head;
	
	public void push( Object data ) {
		SLLNode newNode = new SLLNode(data);
		
		if ( head != null ) {
			newNode.setNext( head );
 		}
		head = newNode;
	}
	
	public Object pop() {
		
		if ( head != null ) {
			Object result = head.getData();
			head = head.getNext();
			return result;
		} else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		SLLNode cursor = head;
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while ( cursor != null ) {
			sb.append(cursor.getData() );
			if ( cursor.getNext() !=null ) {
				sb.append(", ");
			}
			cursor = cursor.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
