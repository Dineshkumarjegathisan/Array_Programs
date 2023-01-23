package Arrays;

import java.util.Arrays;

public class RemvoeDupliacte {
	public static void remDupli(int arr[]) {
		boolean[] visited = new boolean[arr.length];// take boolean with new array length with taken array
		// System.out.println(visited.toString());
		int size = 0;
		for (int i = 0; i < arr.length; i++) // take for loop and i start with 0
		{
			for (int j = i + 1; j < arr.length; j++)// take another for loop j start with i+1
			{
				if (arr[i] == arr[j] && visited[i] == false)// arr[]i==arr[j]and visited[i]must be false in that
															// visited[j]==must be true
				{
					visited[j] = true;
				}
			}
			if (visited[i] == false)// in visited[i] == false increase size by 1
			{
				size++;
				// System.out.println(size);
			}
			// System.out.println(size);
		}
		int temp[] = new int[size];
		for (int i = 0, k = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				temp[k++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 4, 5 };
		remDupli(arr);
	}
}
