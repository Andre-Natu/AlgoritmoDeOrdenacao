public class SelectionSort {



	public static int[] SSort(int[] array) {

		int n = array.length;
		
		for (int i = 0; i < n - 1; i++) {
			
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[min_idx])
					min_idx = j;
			
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
			
		}
		
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
