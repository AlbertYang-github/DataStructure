package sort;

public class SortTest {
	public static void main(String[] args) {
		long[] arr = {34, 12, 67, 34, 14};
		
		BubbleSort.sort(arr);
		print(arr);
		
		StraightSelectionSort.sort(arr);
		print(arr);
		
		StraightInsertionSort.sort(arr);
		print(arr);
		
		
	}
	
	public static void print(long[] arr) {
		System.out.print("[ ");
		for (long num : arr) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
	}
}
