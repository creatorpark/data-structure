package linear.list;


public class SLLNode {
	
	private Object 		data;
	private SLLNode 		next;
	
	public SLLNode(Object data) {
		this.data = data;
		this.next = null;
	}
	
	public SLLNode(Object data, SLLNode next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public SLLNode getNext() {
		return next;
	}
	
	public void setNext(SLLNode next) {
		this.next = next;
	}
	
	public String toString() {
		return data.toString();
	}
}
