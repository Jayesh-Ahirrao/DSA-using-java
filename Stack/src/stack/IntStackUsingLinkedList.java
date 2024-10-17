package stack;

public class IntStackUsingLinkedList {
	private Node top;
	private int currSize;

	public IntStackUsingLinkedList() {
		top = null;
		currSize = 0;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public boolean push(int val) {
		// addAtFirst
		Node newNode = new Node(val);
		newNode.setNext(top);
		top = newNode;
		currSize++;
		return true;
	}

	public int pop() throws RuntimeException {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		int data = top.getData();
		top = top.getNext();
		currSize--;
		return data;
	}

	public int peek() throws RuntimeException {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return top.getData();
	}

	public int size() {
		return currSize;
	}

	public void display() {
		System.out.println("\t|        |");

		Node temp = top;

		while (temp != null) {
			System.out.println("\t|   " + temp.getData() + "   |");
			temp = temp.getNext();
		}

		System.out.println("\t _______");
		System.out.println();
		System.out.println();

	}

}
