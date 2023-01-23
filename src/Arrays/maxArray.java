package Arrays;

public class maxArray {
	public static void maxm(int arr[]) {

		int max = arr[0];
		// int min=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			// else if(arr[i]<min)
			// {
			// min=arr[i];
			// }

		}
		// System.out.println(min);
		System.out.println("The max Array is :"+ max);

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 56, 7, 9887, 9 };
		maxm(arr);
	}

}
