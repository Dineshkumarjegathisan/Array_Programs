package Arrays;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 4, 3, 3 };
		freq(arr);

	}

	public static void freq(int arr[]) {

		boolean[] visited = new boolean[arr.length];
		// System.out.println(Arrays.toString(visited));
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && visited[i] == false) {
					count++;
					visited[j] = true;

				}
			}
			if (visited[i] == false) {
				System.out.println(arr[i] + " " + "present in" + " " + count + " " + "Times");
			}
		}
	}

}
