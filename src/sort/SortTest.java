package sort;

public class SortTest {
	public static void main(String[] args) {
		long[] arr = {34, 12, 67, 34, 14};
		
		//√∞≈›≈≈–Ú
		BubbleSort.sort(arr);
		print(arr);
		
		//÷±Ω”—°‘Ò≈≈–Ú
		StraightSelectionSort.sort(arr);
		print(arr);
		
		//÷±Ω”≤Â»Î≈≈–Ú
		StraightInsertionSort.sort(arr);
		print(arr);
		
		//π˛π˛
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
