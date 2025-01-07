package graph;

import java.util.Scanner;

public class GraphWithAdjMat {
	private int[][] adjMatrix;
	private int[] degree;
	private int numberOfVertices;

	public GraphWithAdjMat() {
		numberOfVertices = 5;
		adjMatrix = new int[numberOfVertices][numberOfVertices];

		// initialise with -1;
		for (int i = 0; i < numberOfVertices; i++) {
			for (int j = 0; j < numberOfVertices; j++) {
				adjMatrix[i][j] = -1;
			}
		}
		degree = new int[numberOfVertices];
	}

	public GraphWithAdjMat(int n) {
		numberOfVertices = n;
		adjMatrix = new int[numberOfVertices][numberOfVertices];
		// initialise with -1;
		for (int i = 0; i < numberOfVertices; i++) {
			for (int j = 0; j < numberOfVertices; j++) {
				adjMatrix[i][j] = -1;
			}
		}
		degree = new int[numberOfVertices];
	}

	public void initGraph(Scanner sc) {
		System.out.println("");
		int data = 0;
		boolean invalidInput = false;

		System.out.println("Enter '1' when edge exist OR '0' when no edge exist");

		for (int i = 0; i < numberOfVertices; i++) {

			for (int j = 0; j < numberOfVertices; j++) {
				if (adjMatrix[i][j] == -1) {
					do {
						System.out.println("Does edge exist between " + (i + 1) + " and " + (j + 1));
						data = sc.nextInt();
						if (data == 1 || data == 0) {
							adjMatrix[i][j] = data;
							adjMatrix[j][i] = data;
							invalidInput = false;
						} else {
							invalidInput = true;
						}
					} while (invalidInput);
				}
			} // for_j
		} // for_i
	}// initGraph()

	public void displayAdjMatrix() {
		for (int i = 0; i < numberOfVertices; i++) {
			for (int j = 0; j < numberOfVertices; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}// displayAdjMatrix

	public void countDegree() {
		int count = 0;
		for (int i = 0; i < numberOfVertices; i++) {
			count = 0;
			for (int j = 0; j < numberOfVertices; j++) {
				if (adjMatrix[i][j] == 1)
					count++;
			}
			degree[i] = count;
		}
	}

	public void DFS() {

	}// DFS

}
