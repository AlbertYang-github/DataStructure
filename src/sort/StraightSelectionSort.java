package sort;

/**
 * 直接选择排序算法
 */
public class StraightSelectionSort {
	public static void sort(long[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					long temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
		}
	}
}
