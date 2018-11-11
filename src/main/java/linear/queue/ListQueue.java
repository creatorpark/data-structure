package linear.queue;

import linear.list.SLLNode;

public class ListQueue {

	SLLNode front = null;
	SLLNode rear = null;
	
	
	/*
	 * 뒤로 대기 시킨다.
	 */
	public void enQueue( Object data ) {
		SLLNode newNode = new SLLNode(data);

		if ( front == null ) {
			front = newNode;
			rear = newNode;
		} else {
			rear.setNext( newNode );
			rear = newNode;
		}
	}
	
	/*
	 *앞에놈 부터 뺀다. 
	 */
	public Object deQueue() {
		
		if ( front == null ) {
			return null;
		} else {
			SLLNode cursor = front.getNext();
			front = cursor;
			
			if ( front == null ) rear = null;
			
			return cursor.getData();
		}
	}
	
	@Override
	public String toString() {
		
		return null;
	}
}
