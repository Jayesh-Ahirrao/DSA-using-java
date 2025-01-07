package sort;

public class Sort {
	public static void bubble_sort(int arr[]) {
		System.out.println("Sorting using bubble sort");
		int size = arr.length;
		boolean isSwapper = false;

		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void insertion_sort(int arr[]) {
		System.out.println("Sorting using insertion sort");
		int size = arr.length;

		if (size < 2)
			return;

		int smaller = arr[1];

		for (int i = 1; i < size; i++) {
			smaller = arr[i];

			for (int j = i - 1; j >= 0 && arr[j] > smaller; j--) {

			}
		}
	}

	public static void mergeSort(int[] arr) {

		return;
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		
		int [] ans = new int[arr1.length + arr2.length];
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				ans[k++] = arr1[i++];
			}else {
				ans[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		
		while(j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		
		return ans;
	}
}					





