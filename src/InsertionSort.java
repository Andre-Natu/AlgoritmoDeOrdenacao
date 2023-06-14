public class InsertionSort {


	private InsertionSort() {
	}

	public static void InSort(int[] array) {

		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
	
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;

		}

	}

	private static void printArray(int[] array) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : array) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder);
	}

}
