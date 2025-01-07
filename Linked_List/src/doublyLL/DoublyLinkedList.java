package doublyLL;

public class DoublyLinkedList {
	private Node head;

	public DoublyLinkedList() {
		head = null;
	}

	public Node createNode(int data) {
		return new Node(data);
	}

	public boolean isEmpty() {
		return head == null;
	}

	// ***************************** adding nodes *****************************

	public void addAtStart(int data) {
		Node newNode = createNode(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
	}

	public void addAtEnd(int data) {
		Node newNode = createNode(data);
		if (isEmpty()) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		newNode.setPrev(temp);
	}

	public void addAfterValue(int val, int data) {
		Node newNode = createNode(data);

		if (isEmpty()) {
			head = newNode;
			return;
		}
		
		Node temp = head;

		while (temp != null && temp.getData() != val)
			temp = temp.getNext();

		if (temp == null) {
			System.out.println("Node with value " + val + " is not found");
			return;
		}

		newNode.setNext(temp.getNext());
		newNode.setPrev(temp);
		temp.setNext(newNode);
		
		//assigning the next node's previous address to newly inserted node only if its not the end(null)
		if(newNode.getNext() != null) {
			newNode.getNext().setPrev(newNode);
		}
		
		return;
	}

	public void addAtPosition(int pos, int data) {
		Node newNode = createNode(data);
		if (isEmpty()) {
			if (pos == 1) {
				head = newNode;
			} else {
				System.out.println("Position does not exist");
			}
			return;
		}

		Node temp = head;
		int currPosition = 1;
		while (temp != null && currPosition < pos)
			temp = temp.getNext();

		newNode.setNext(temp);
		newNode.setPrev(temp.getPrev());
		temp.setPrev(newNode);
		
		//if the node is at later positions of LL then the prev also needs to be pointed to new node
		if(temp.getPrev() != null) {
			temp.getPrev().setNext(newNode);
		}
		
	}

	// ***************************** deleting nodes *****************************

	public void deleteAtStart() {
		if (!isEmpty()) {
			head = head.getNext();
			head.setPrev(null);
		}
	}

	public void deleteAtEnd() {
		if (!isEmpty()) {
			Node temp = head;
			
			if(head.getNext() == null) {
				head = null;
				return;
			}
			
			while (temp.getNext().getClass() != null) {
				temp = temp.getNext();
			}
			temp.setNext(null);
		}
	}
}
