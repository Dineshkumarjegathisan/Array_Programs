package Arrays;

//bubble Sort with Exception 
import java.util.Arrays;

public class sort {
	public static void name(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				try {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
			}
			// System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 36, 28, 62, 87, 29, 83, 91, 72, 91, 73, 87, 22, 89, 19 };
		// int arr[]= {9,8,7,6,5,4,3,2,1};
		name(arr);
	}
}
