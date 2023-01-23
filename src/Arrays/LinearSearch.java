package Arrays;

public class LinearSearch {

	public static void main(String[] args)// array contains given array present or not
	{
		int arr[] = { 1, 2, 4, 5, 6, 7, 8 };
		linear(arr, 5);
	}

	public static void linear(int arr[], int element) {

		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				System.out.println(element + " " + "is present");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Element is not present");
		}
	}

}
