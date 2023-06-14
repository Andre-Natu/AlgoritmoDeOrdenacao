public class SelectionSort {

	/*
	 * uncomment printarray(array); to follow the sorting steps. But It will affect
	 * the Performance
	 */

	public static int[] SSort(int[] array) {
		// printarray(array);
		int n = array.length;
		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[min_idx])
					min_idx = j;
			// Swap the found minimum element with the first
			// element
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
			// printarray(array);
		}
		// printarray(array);
		return array;
	}

	private static void printarray(int[] tab) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : tab) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder.toString());
	}
}
