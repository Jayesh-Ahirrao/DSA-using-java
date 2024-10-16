package singlyll;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		int input = 1;
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			do {
				input = 1;
				System.out.println("*********************************************************");

				System.out.println("Enter input from following menu");
				System.out.println("1 : to add node at start \n" +
									"2: to add node at end\n" +
									"3: to add node at middle\n" +
									"4: to add at position\n" +
									
									"5: to delete from start\n" +
									"6: to delete from end\n" +
									"7: to delete by value\n" +
									"8: to delete by position\n" +
									
									
									"9: to reverse linked list\n" +
									"10: to update one node\n" +
									"11: to update all nodes with the value\n" +
									
									
									"99: to display Linked List\n" + 
									"0: to exit\n");

				input = sc.nextInt();

				if (input == 0) {

					break;
				}

				switch (input) {
				case 1: {

					ll.addAtStart();
					break;
				}
				case 2: {

					ll.addAtEnd();
					break;
				}
				case 3: {
					System.out.println("Enter node values after which you want to add new node");
					int val = sc.nextInt();
					ll.addAtMiddleByValue(val);
					break;
				}
				case 4 :
					System.out.println("Enter the position you want to add");
					int pos = sc.nextInt();
					ll.addAtPosition(pos);
					break;
				case 5:
					ll.deleteAtStart();
					break;
				case 6:
					ll.deleteAtEnd();
					break;
				case 7:
					System.out.println("Enter the value you want to delete");
					int val = sc.nextInt();
					ll.deleteByValue(val);
					break;
				case 8:
					System.out.println("Enter the position you want to delete");
					int pos1 = sc.nextInt();
					ll.deleteByPosition(pos1);
					break;
				case 9:
					ll.reverseLL();
					break;
				case 10:
					System.out.println("Enter the Node you want to update");
					val = sc.nextInt();
					System.out.println("Enter the new value");
					int newVal= sc.nextInt();
					ll.modifyOne(val, newVal);
					break;
				case 11:
					System.out.println("Enter the Node you want to update");
					val = sc.nextInt();
					System.out.println("Enter the new value");
					newVal= sc.nextInt();
					ll.modifyAll(val, newVal);
					break;
				case 99: {

					ll.display();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}

			} while (input != 0);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}

}
