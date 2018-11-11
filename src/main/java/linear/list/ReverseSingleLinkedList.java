package linear.list;


public class ReverseSingleLinkedList extends SingleLinkedList {


	//TODO 역순으로 값찾기

	//역순으로 바꾸기
	public void reverseNode() {
		
		SLLNode currentNode = head;
		SLLNode prevNode = null;
		SLLNode nextNode = null;
		
		while ( currentNode != null ) {
			nextNode = currentNode.getNext();
			currentNode.setNext( prevNode );
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}
	
	public String reverseIndex(int reverseIndex) {
		return "";
	}
	
}
