package bst;

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTree(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void add(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Node temp = root;
		while (true && temp != null) {
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					break;
				} else {
					temp = temp.getLeft();
				}
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					break;
				} else {
					temp = temp.getRight();
				}
			}
		}
	}

	public void deleteByValue(int val) {
		Node temp = root;
		Node tag = root;

		// search if node exists or not?
		while (temp != null && temp.getData() != val) {
			tag = temp;

			if (temp.getData() <= val) {
				temp = temp.getRight();
			} else {
				temp = temp.getLeft();
			}
		}

		// not fonud
		if (temp == null) {
			System.out.println("Not not found in BST");
			return;
		}

		// found
		// first check if its at left or at riht of its parent (ie. tag) and add
		// accordingly
		else {

			// 1. if deleting node is leaf node
			if (isLeaf(temp)) {
				if (tag.getLeft() == temp) {
					tag.setLeft(null);
				} else {
					tag.setRight(null);
				}
			}

			// 2. only left subtree exist and right is null
			else if (temp.getLeft() != null && temp.getRight() == null) {
				if (tag.getLeft() == temp) {
					tag.setLeft(temp.getLeft());
				} else {
					tag.setRight(temp.getLeft());
				}
			}

			// 3. only right subtree exist and left is nill
			else if (temp.getRight() != null && temp.getLeft() == null) {
				if (tag.getLeft() == temp) {
					tag.setLeft(temp.getRight());
				} else {
					tag.setRight(temp.getRight());
				}
			}

			// 4. both subtree exist
			// we can uplist any of the subtree but we will chose the right subtree to be
			// uplifted
			// as we uplifting right subtree, attach the left subtree to rightmost node of
			// right subtree
			// as we have checked all considiton from this line its confirm that tree will
			// have both subtrees
			else {
				Node temp2 = temp.getRight();
				
				if (tag.getLeft() == temp) {
					tag.setLeft(temp2);
				} else {
					tag.setRight(temp2);
				}

				while (temp2.getLeft() != null) {
					temp2 = temp.getLeft();
				}
				temp2.setLeft(temp.getLeft());
			}

		}

	}

	public boolean isLeaf(Node root) {
		return (root.getLeft() == null && root.getRight() == null);
	}

	public void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrder(root.getRight());
	}

	public void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.getData() + " ");
		inOrder(root.getLeft());
		inOrder(root.getRight());
	}

	public void postOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.getLeft());
		inOrder(root.getRight());
		System.out.print(root.getData() + " ");
	}

}
