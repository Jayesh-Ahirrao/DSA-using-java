package doublyLL;

public class Node {
	private int data;
	private Node next;
	private Node prev;

	public Node() {
		data = 0;
		next = prev = null;
	}

	public Node(int data) {
		this.data = data;
		next = prev = null;
	}

	public int getData() {
		return data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " <- " + this.data + " -> ";
	}
}
