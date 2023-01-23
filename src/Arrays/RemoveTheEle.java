package Arrays;

import java.util.Arrays;

public class RemoveTheEle {

	public static void isDel(int arr[], int index, int elemnet) {
		int empty[] = new int[arr.length - 1];
		// int k=0;
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {

			} else {
				empty[k++] = arr[i];
			}

		}
		System.out.println(Arrays.toString(empty));

	}

	public static void main(String[] args) {
		// int arr[]= {1,2,3,4,5,6,7,8,9};
		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// int index=1;
		// int element=9;
		// int element=3;
		isDel(arr, 3, 6);

	}

}
