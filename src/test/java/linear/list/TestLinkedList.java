package linear.list;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void test() {
		
		SingleLinkedList list = new SingleLinkedList();

		list.add(new SLLNode("삼다수1"));
		list.add(new SLLNode("삼다수2"));
		list.add(new SLLNode("삼다수3"));
		list.add(3, new SLLNode("삼다수4"));

		System.out.println("ADD      4 : " + list.toString());
		list.remove(0);
		System.out.println("REMOVE 0 : " + list.toString());
		list.remove(1);
		System.out.println("REMOVE 1 : " + list.toString());

		list.add(0,new SLLNode("삼다수0"));
		list.add(0,new SLLNode("삼다수1"));
		System.out.println("ADD       2 : " + list.toString());
		System.out.println("Index     3 : " + list.get(3));
	}
	
//	@Test
	public void testReverse() {
		ReverseSingleLinkedList list = new ReverseSingleLinkedList();
		list.add(new SLLNode("삼다수1"));
		list.add(new SLLNode("삼다수2"));
		list.add(new SLLNode("삼다수3"));
		list.add(3, new SLLNode("삼다수4"));
		System.out.println("BEFORE : " + list.toString() );
		list.reverseNode();
		System.out.println("REVERSE : " + list.toString() );
	}

}
