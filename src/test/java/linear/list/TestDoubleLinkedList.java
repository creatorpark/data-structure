package linear.list;

import org.junit.Test;

public class TestDoubleLinkedList {

	@Test
	public void test() {
		
		DoubleLinkedList list = new DoubleLinkedList();

		list.add(5, new DLLNode("삼다수1"));
		list.add(4, new DLLNode("삼다수2"));
		list.add(3, new DLLNode("삼다수3"));

//		
//		System.out.println("Single LinkedList 2 :\n" + list.get(2));
		System.out.println("ADD  3 : " + list.toString());
		list.remove(0);
		System.out.println("REMOVE 0 : " + list.toString());
		list.remove(5);
		System.out.println("REMOVE 5 : " + list.toString());
		
		list.add(0,new DLLNode("삼다수0"));
		list.add(0,new DLLNode("삼다수1"));
		System.out.println("ADD 2 : " + list.toString());
		System.out.println("getindex 5 : " + list.get(5));
	}

}
