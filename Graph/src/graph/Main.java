package graph;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GraphWithAdjMat graph = new GraphWithAdjMat();
		int choice = -1;

		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n\nChose among the following choices\n" + 
								"1. to add to initialise Graph\n" + 
								"2. to display adjacency matrix\n" + 
								"0. to exit");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					graph.initGraph(sc);
					break;
				case 2:
					graph.displayAdjMatrix();
					break;
//				case 3:
//					bst.preOrder(bst.getRoot());
//					break;
//				case 4:
//					bst.postOrder(bst.getRoot());
//					break;
					
				}

			} while (choice != 0);
		}

	}

}
