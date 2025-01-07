package hashing;

import java.util.Scanner;

public class Main {
	public static void main(String[] arr) {
		HashTable hash = new HashTable(5);
		int choice = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("\n************ Chose from following Menu ************\n" + "1. add to hashtable\n"
						+ "2. display\n" + "0. exit\n");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter the value you want to enter");
					int value = sc.nextInt();
					hash.put(value);
					break;
				case 2:
					hash.display();
					break;
				}
			} while (choice != 0);
		}
	}

}
