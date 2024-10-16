package sort;

public class Sort {
	public static void bubble_sort(int arr[]) {
		System.out.println("Sorting using bubble sort");
		int size = arr.length;
		boolean isSwapper = false;
		
		for(int i = 0; i < size ; i++) {
			
			for (int j = 0; j < size - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}
}
