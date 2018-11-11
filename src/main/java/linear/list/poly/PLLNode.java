package linear.list.poly;


public class PLLNode {

	public int coefficient;
	public int exponent;
	public PLLNode next;
	
	public PLLNode() {
		super();
	}

	public PLLNode(int coefficient, int exponent) {
		super();
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	public int getCoefficient() {
		return coefficient;
	}
	
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	public int getExponent() {
		return exponent;
	}
	
	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
	public PLLNode getNext() {
		return next;
	}
	
	public void setNext(PLLNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		
		return coefficient + "x^" + exponent;
	}
}
