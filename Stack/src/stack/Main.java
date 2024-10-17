package stack;

public class Main {
	
	public static void main(String [] args) {
		//useIntStackWithArray();
		useIntStackWithLinkedList();
	}	
	
	
	public static void useIntStackWithLinkedList() {
		IntStackUsingLinkedList stLL = new IntStackUsingLinkedList();
		stLL.display();
		
		
		stLL.push(90);
		stLL.push(80);
		stLL.push(70);
		stLL.push(60);
		stLL.push(50);
		stLL.display();

		
		System.out.println("Popping element from stack: " + stLL.pop());
		stLL.display();
		
		
		System.out.println("Peeking element from stack: " + stLL.peek());
		stLL.display();
		
		System.out.println("Size of stack: " + stLL.size());
	}
	
	public static void useIntStackWithArray() {
		IntStackUsingArrays stArray = new IntStackUsingArrays(5);
		stArray.display();
		stArray.push(10);
		stArray.push(20);
		stArray.push(30);
		stArray.push(40);
		
		stArray.display();
		
		
		System.out.println("Popping top element: "  + stArray.pop());
		stArray.display();
		
		System.out.println("Peeking top element: "  + stArray.peek());
		stArray.display();
		
		System.out.println("Size of Stack: "  + stArray.size());	
	}
}
