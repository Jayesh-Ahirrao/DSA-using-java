package conversions;

import java.util.Scanner;

public class Main {

	public static String infix_postfix(String infix) {
		CharStackUsingLL st = new CharStackUsingLL();

		String postfix = "";

		for (int i = 0; i < infix.length(); i++) {
			char currChar = infix.charAt(i);
			System.out.println("Curr char: " + currChar);

			if (isOperand(currChar)) {
				postfix += currChar;
			} else {
				// assuming expression is valid and only contains operands and operators
				// direct push if stack is empty or top element is opening bracket ==> '('
				if (isOpening(currChar) || st.isEmpty() || isOpening(st.peek())) {
					st.push(currChar);
				}
				// keep on popping until we reach respective opening
				else if (isClosing(currChar)) {
					char ch;
					while (!st.isEmpty() && (ch = st.pop()) != '(') {
						System.out.println("inside closing bracket: " + currChar);
						postfix += ch;
					}
				} else if (getPriority(currChar) <= getPriority(st.peek())) {
					char ch;
					while (!st.isEmpty() && getPriority(currChar) <= getPriority(ch = st.pop())) {
						postfix += ch;
					}
					st.push(currChar);
				} else {
					st.push(currChar);
				}
				System.out.println("postfix: " + postfix);
			}
			st.display();
		}

		while (!st.isEmpty()) {
			postfix += st.pop();
		}

		return postfix;
	}

	public static int getPriority(char ch) {
		switch (ch) {
		case '^':
			return 1;
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
		case '%':
			return 3;
		}

		return -1;
	}

	private static boolean isOperand(char ch) {
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			return true;
		}
		return false;
	}

	private static boolean isOpening(char ch) {
		return ch == '(';
	}

	private static boolean isClosing(char ch) {
		return ch == ')';
	}

	public static void main(String[] args) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		String infix = "";

		do {
			System.out.println("Enter infix expression");
			infix = sc.next();
			System.out.println(infix_postfix(infix));

			System.out.println("\nEnter another expression OR enter 99 to exit");
			option = sc.nextInt();

		} while (option != 0);

	}

}
