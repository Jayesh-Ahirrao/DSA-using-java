package bst;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		int choice = -1;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n\nChose among the following choices\n" + 
								"1. to add to BST\n" + 
								"2. to print inorder traversal\n" + 
								"3. to print preorder traversal\n" + 
								"4. to print postorder traversal\n" +
								"0. to exit");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter data you want to enter");
					int data = sc.nextInt();
					bst.add(data);
					break;
				case 2:
					bst.inOrder(bst.getRoot());
					break;
				case 3:
					bst.preOrder(bst.getRoot());
					break;
				case 4:
					bst.postOrder(bst.getRoot());
					break;
				}

			} while (choice != 0);
		}
	}

}
