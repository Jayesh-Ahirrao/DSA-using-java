package queue;

public class QueueLinearArray {
	private int size;
	private int[] queue;
	private int front;
	private int rear;

	public QueueLinearArray() {
		front = rear = -1;
		size = 10;
		queue = new int[size];
	}

	public QueueLinearArray(int size) {
		front = rear = -1;
		this.size = size;
		queue = new int[size];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public int size() {
		return size;
	}

	public boolean isFull() {
		return rear == (size - 1);
	}

	public boolean offer(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
			return false;
		}

		queue[++rear] = num;
		return true;
	}

	public int poll() {
		if (isEmpty()) {
			System.out.println("Queue already empty");
			return -1;
		}
		return queue[++front];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("-------------------------- Queue --------------------------\n");
		for(int i = front+1; i <= rear; i++) {
			sb.append(queue[i]+ " <-- ");
		}
		
		return sb.toString();
	}
}
