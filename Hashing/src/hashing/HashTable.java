package hashing;

public class HashTable {
	private int size;
	private int arr[];

	public HashTable(int size) {
		this.size = size;
		arr = new int[size];
		initArray();
	}

	private void initArray() {
		for (int i = 0; i < size; i++) {
			arr[i] = -1;
		}
	}

	private int getHashKey(int value) {
		return value % size;
	}

	// Linear probing
	/*
	 * edge cases: 1. if position already occupied 2. if entire array occupied 3. no
	 * duplicate values
	 * 
	 */
	private int getValidIndex(int hashIndex, int value) {
		int validIndex = -1;

		if (arr[hashIndex] == value) {
			System.err.println("Duplicate values entered: " + value + ", Index: " + hashIndex);

			return validIndex;
		}

		if (arr[hashIndex] != -1) {
			// this means that our position is already occupied

			int i = (hashIndex + 1) % size;

			// 1. checking if we are not coming to same position
			// 2. 2nd condition checking for if there is no duplicate values
			// 3. 3rd condition checking if theres vacant space available or not
			while (true) {
				// i != hashIndex && arr[i] != arr[hashIndex] && arr[i] != -1

				if (i == hashIndex) {
					// means we are in circular loop and array if full
					System.err.println("Array is full"); // we can return size to handle this in calling fn
					break;
				} else if (arr[i] == arr[hashIndex]) {
					// this means there is duplicate element present
					System.err.println("Value already present in HashTable");
					break;
				} else if (arr[i] == -1) {
					// means we have found the vacant space and new value can be stored here
					validIndex = i;
					break;
				}
				i = (i + 1) % size;
			}

			hashIndex = i;
		} else {

			validIndex = hashIndex;
		}

		return validIndex;
	}

	public boolean put(int value) {
		int index = getHashKey(value);

		if ((index = getValidIndex(index, value)) == -1) {
			return false;
		}

		arr[index] = value;
		return true;
	}
	

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(i + " ----- " + arr[i]);
		}
	}

}
