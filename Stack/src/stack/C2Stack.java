package stack;

import javax.swing.plaf.multi.MultiSeparatorUI;

public class C2Stack {
	private int size;
	private int[] arr;
	private int top1;
	private int top2;

	public C2Stack() {
		size = 10;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	public C2Stack(int size) {
		this.size = size;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}

	public boolean isEmpty() {
		return top1 == -1 && top2 == size;
	}

	public boolean isEmpty1() {
		return top1 == -1;
	}

	public boolean isEmpty2() {
		return top2 == size;
	}

	public boolean isFull() {
		return top1 == top2 - 1;
	}

	public void push1(int data) {
		if (!isFull()) {
			arr[++top1] = data;
		} else {
			System.out.println("Stack is full");
		}
	}

	public void push2(int data) {
		if (!isFull()) {
			arr[--top2] = data;
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop1() {
		int ans = -1;
		if (!isEmpty1()) {
			ans = arr[top1--];
		}
		return ans;
	}

	public int pop2() {
		int ans = -1;
		if (!isEmpty1()) {
			ans = arr[top2++];
		}
		return ans;
	}

	public int peek1() {
		int ans = -1;
		if (!isEmpty1()) {
			ans = arr[top1];
		}
		return ans;
	}

	public int peek2() {
		int ans = -1;
		if (!isEmpty2()) {
			ans = arr[top2];
		}
		return ans;
	}
	
	public void display1() {
		System.out.println("*************** Stack 1 ***************");
		for(int i = top1; i < top2; i++) {
			System.out.println("\t +arr[top1] + \t");
		}
	}
}
