package conversions;

import stack.Node;

public class CharStackUsingLL {
	private CharNode top;

	public CharStackUsingLL() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(char ch) {
		CharNode newNode = new CharNode(ch);
		newNode.setNext(top);
		top = newNode;
	}

	public char pop() {
		if (isEmpty())
			return '\0';
		char ch = top.getData();
		top = top.getNext();
		return ch;
	}

	public char peek() {
		if (isEmpty())
			return '\0';
		return top.getData();
	}

	public void display() {
		System.out.println("\t|        |");

		CharNode temp = top;

		while (temp != null) {
			System.out.println("\t|   " + temp.getData() + "   |");
			temp = temp.getNext();
		}

		System.out.println("\t _______");
		System.out.println();
		System.out.println();

	}
}
