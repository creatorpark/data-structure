package linear.list;

import linear.list.poly.PLLNode;
import linear.list.poly.PolyLinkedList;

import org.junit.Test;

public class TestPolyLinkedList {

	@Test
	public void test() {
		
		PolyLinkedList list = new PolyLinkedList();

		list.add(new PLLNode(3, 5));
		list.add(new PLLNode(2, 4));
		list.add(new PLLNode(3, 1));
		
		PolyLinkedList list2 = new PolyLinkedList();
		list2.add(new PLLNode(3, 4));
		list2.add(new PLLNode(1, 3));
		list2.add(new PLLNode(4, 2));
		PolyLinkedList result  = list.addPoly(list2);
		
		// 3x^5 5x^4  1x^3 4x^2 3x^1
		System.out.println(result.toString());
	}
	
}
