package singlyll;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	public Node createNode(int data) {
		Node newNode = new Node(data);
		return newNode;
	}

	public Node createNode() {
		System.out.println("Enter the data for node");
		int data = 0;

		// closing sc also closes System.in so it gives Nosuchelement Exception in main
		// methods sc
		/*
		 * try (Scanner sc = new Scanner(System.in)) { data = sc.nextInt(); } catch
		 * (Exception e) { System.out.println(e); }
		 */
		Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		Node newNode = new Node(data);
		return newNode;
	}

	// ***************************** Adding nodes *****************************

	public void addAtStart() {
		Node newNode = createNode();

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.setNext(head);
		head = newNode;
	}

	public void addAtEnd() {
		Node newNode = createNode();

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
	}

	public void addAtMiddleByValue(int val) {
		Node newNode = createNode();

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp != null) {
			if (temp.getData() == val) {
				break;
			}
			temp = temp.getNext();
		}

		if (temp == null) {
			System.out.println("The value not present in Linked List");
			return;
		}

		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

	}

	public boolean addAtPosition(int pos) {
		Node temp = head;

		if (pos > 0) {
			Node newNode = createNode();

			if (head != null && pos == 1) {
				newNode.setNext(head);
				head = newNode;
				return true;
			}

			int currPosition = 1;

			// find the position
			while (temp != null && currPosition < pos - 1) {
				temp = temp.getNext();
				currPosition++;
			}

			if (temp == null) {
				System.out.println("Invalid positon : position entered is bigger than than the size of list");
				return false;
			}

			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			return true;
		}

		return false;
	}

	// ***************************** Deleting nodes *****************************

	public void deleteAtStart() {
		if (head == null)
			return;
		head = head.getNext();
	}

	public void deleteAtEnd() {
		if (head == null)
			return;

		Node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}

		temp.setNext(null);
	}

	public void deleteByValue(int val) {
		if (head == null)
			return;

		if (head.getData() == val) {
			head = head.getNext();
		}

		Node prev = head;
		Node curr = head.getNext();

		while (curr != null && curr.getData() != val) {
			prev = curr;
			curr = curr.getNext();
		}

		if (curr == null) {
			System.out.println("No such node present in linked list");
			return;
		}

		prev.setNext(curr.getNext());
	}

	public boolean deleteByPosition(int pos) {
		if (pos < 0) {
			System.out.println("Invalid position : position must be greater than 0");
			return false;
		}

		if (pos == 1) {
			head = head.getNext();
			return true;
		}

		Node temp = head;
		int currPosition = 1;

		while (temp != null && currPosition < pos) {
			temp = temp.getNext();
			currPosition++;
		}

		if (temp == null) {
			System.out.println("Invalid position: position doesnt exist");
			return false;
		}

		temp.setNext(temp.getNext().getNext());

		return true;
	}

	// ***************************** Operations*****************************

	public void reverseLL() {
		Node prev = null;
		Node curr = head;
		Node front = null;

		while (curr != null) {
			// storing next node;
			front = curr.getNext();

			// reversing linkage
			curr.setNext(prev);

			prev = curr;
			curr = front;
		}

		head = prev;
	}

	public void modifyAll(int val, int newVal) {
		Node temp = head;
		while (temp != null) {
			if (temp.getData() == val) {
				temp.setData(newVal);
			}
			temp = temp.getNext();
		}
	}

	public void modifyOne(int val, int newVal) {
		Node temp = head;
		while (temp != null && temp.getData() != val) {
			temp = temp.getNext();
		}

		if (temp != null) {
			temp.setData(newVal);
		}
	}
	
	
	public int countNodes() {
		int count = 0;

		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.getNext();
		}

		return count;
	}

	public void display() {
		System.out.print("Linked List : ");
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("NULL");
	}
}
