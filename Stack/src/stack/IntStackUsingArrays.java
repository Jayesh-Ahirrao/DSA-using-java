package stack;

public class IntStackUsingArrays {
	private int[] arr;
	private int top;
	private int capacity;

	public IntStackUsingArrays() {
		top = -1;
		capacity = 10;
		arr = new int[capacity];
	}

	public IntStackUsingArrays(int capacity) {
		top = -1;
		this.capacity = capacity;
		arr = new int[capacity];
	}

	public boolean isFull() {
		return top == capacity;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.println("Stack is Full !!!");
			return false;
		}

		arr[++top] = data;
		return true;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty !!!");
			return -1;
		}
		return arr[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty !!!");
			return -1;
		}
		return arr[top];
	}

	public int size() {
		return top + 1;
	}

	public void display() {
		System.out.println("\t|        |");

		for (int i = top; i >= 0; i--) {
			System.out.println("\t|   " + arr[i] + "   |");
		}

		System.out.println("\t _______");
		System.out.println();
		System.out.println();

		
	}
}
