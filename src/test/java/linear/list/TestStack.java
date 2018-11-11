package linear.list;

import linear.stack.ListStack;

import org.junit.Test;

public class TestStack {

	@Test
	public void test() {
		
		ListStack stack = new ListStack();
		
		stack.push("3");
		stack.push("1");
		stack.push("5");
		
		System.out.println( stack.toString() );
		
		stack.pop();
		System.out.println( stack.toString() );
	}

}

