package sort;

/**
 * 直接插入排序算法
 */
public class StraightInsertionSort {
	public static void sort(long[] arr) {
		for (int i = 1; i < arr.length; i++) {
			long temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}
}
