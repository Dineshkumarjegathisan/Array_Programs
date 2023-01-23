package Arrays;

public class NthOccurenceOfArray {
	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 5, 67, 8, 9, 12, 34, 12 };
		nthocc(arr, 12, 3);

	}

	public static void nthocc(int arr[], int element, int occ) {
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
			if (count == element) {
				System.out.println(element + " " + "is repeated at index" + i);
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(element + " " + "is repeated only" + " " + count + " " + "number of times");
		}
	}

}
