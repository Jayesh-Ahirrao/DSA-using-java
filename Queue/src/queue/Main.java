package queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinearArray q = new QueueLinearArray();

		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("\n\n*********************************************************");

			System.out.println("Choose from following menu");
			System.out.println("1: to add to queue\n" + "2: to remove from queue\n" + "3: to display the queue\n"
					+ "0: to exit\n");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter the value you want to add to queue:\t");
				int val = sc.nextInt();
				q.offer(val);
				break;
			case 2:
				System.out.println(q.poll() + " is removed from queue");
				break;
			case 3:
				System.out.println(q);
				break;
			}
		} while (option != 99);

		option = sc.nextInt();

	}

	public static void useQueueLinearArray(Scanner sc) {

	}

}
