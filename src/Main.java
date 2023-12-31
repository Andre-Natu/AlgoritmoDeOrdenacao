import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

	private static int[] initialise() {
		Random random = new Random();
		int[] tab = new int[100000];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = random.nextInt(9999);
		}
		return tab;
	}

	public static void main(String[] args) {
		HashMap<String, Long> leaderboard = new HashMap<>();
		int[] arrayB = initialise();
		int[] arrayI = initialise();
		int[] arrayM = initialise();
		int[] arrayQ = initialise();
		int[] arrayS = initialise();
		int[] arrayR = initialise();

		System.out.println();

		// print(arrayB, arrayI, arrayM, arrayQ, arrayS, arrayR);

		/* -----------BubbleSort------------ */
		long start = System.nanoTime();
		BubbleSort.BSort(arrayB);
		long finish = System.nanoTime();
		long timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("BubbleSort: " + timeElapsed + " ms");
		leaderboard.put("Bubble Sort", timeElapsed);
		/* ----------InsertionSort------------- */
		start = System.nanoTime();
		InsertionSort.InSort(arrayI);
		finish = System.nanoTime();
		timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("InsertionSort: " + timeElapsed + " ms");
		leaderboard.put("Insertion Sort", timeElapsed);
		/* ----------SelectionSort------------- */
		start = System.nanoTime();
		SelectionSort.SSort(arrayS);
		finish = System.nanoTime();
		timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("SelectionSort: " + timeElapsed + " ms");
		leaderboard.put("Selection Sort", timeElapsed);
		/* ----------MergeSort------------- */
		MergeSort.setArray(arrayM);
		start = System.nanoTime();
		MergeSort.MSort(0, arrayM.length - 1);
		finish = System.nanoTime();
		timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("MergeSort: " + timeElapsed + " ms");
		leaderboard.put("Merge Sort", timeElapsed);

		/* ----------QuickSort------------- */
		start = System.nanoTime();
		QuickSort.Qsort(arrayQ, 0, arrayQ.length - 1);
		finish = System.nanoTime();
		timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("QuickSort: " + timeElapsed + " ms");
		leaderboard.put("Quick Sort", timeElapsed);
		/* ----------RadixSort------------- */
		start = System.nanoTime();
		RadixSort.Rsort(arrayR, arrayR.length);
		finish = System.nanoTime();
		timeElapsed = TimeUnit.NANOSECONDS.toMillis(finish - start);
		System.out.println("RadixSort: " + timeElapsed + " ms");
		leaderboard.put("Radix Sort", timeElapsed);

		// print(arrayB, arrayI, arrayM, arrayQ, arrayS, arrayR);

		System.out.println("\n ************* Leaderboard *************\n");
		leaderboard.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(e -> System.out.println(e.getKey() + " : " + e.getValue() + " ms"));
	}

	private static void printArray(int[] tab) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : tab) {
			stringBuilder.append(j).append(" | ");
		}
		System.out.println(stringBuilder);
	}
	private static void print(int[] arrayB, int[] arrayI, int[] arrayM, int[] arrayQ, int[] arrayS, int[] arrayR) {
		System.out.print("arrayB: ");
		printArray(arrayB);
		System.out.print("arrayI: ");
		printArray(arrayI);
		System.out.print("arrayS: ");
		printArray(arrayS);
		System.out.print("arrayM: ");
		printArray(arrayM);
		System.out.print("arrayQ: ");
		printArray(arrayQ);
		System.out.print("arrayR: ");
		printArray(arrayR);
	}

}
