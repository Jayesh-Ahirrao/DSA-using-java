package conversions;

public class CharNode {
	private char data;
	private CharNode next;
	
	public CharNode() {
		data = 0;
		next = null;
	}
	
	public CharNode(char data) {
		this.data = data;
		next = null;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public CharNode getNext() {
		return next;
	}

	public void setNext(CharNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data + " -> ";
	}

}
