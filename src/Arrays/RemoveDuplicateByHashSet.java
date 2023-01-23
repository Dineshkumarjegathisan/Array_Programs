package Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
//hashset dosn't accept duplicates

public class RemoveDuplicateByHashSet {
	public static void remDupliByHashSet(int arr[]) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		// before using map
		System.out.println("before removing" + Arrays.toString(arr));
		for (int num : arr) {
			lhs.add(num);

		}
		// System.out.println(lhs);//after using map

		int temp[] = new int[lhs.size()];
		// System.out.println(lhs.size());
		int k = 0;
		for (int numb : lhs) {
			temp[k++] = numb;
			// System.out.println("After removing"+Arrays.toString(temp));
		}
		System.out.println("After removing" + Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8 };
		remDupliByHashSet(arr);

	}

}
