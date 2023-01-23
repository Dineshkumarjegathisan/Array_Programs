package Arrays;

import java.util.Arrays;

public class SortArrayBubblesort {
	public static void isSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int temp = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			// System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2 };
		isSort(arr);
	}

}
