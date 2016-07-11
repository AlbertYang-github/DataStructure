package seqlist;

/**
 * 顺序表
 */
public class SeqList {
	private long[] arr;
	// 顺序表的有效长度
	private int elements;

	public SeqList() {
		// 默认大小为50
		arr = new long[50];
	}

	public SeqList(int maxSize) {
		arr = new long[maxSize];
	}

	/**
	 * 显示数据的长度
	 */
	public int size() {
		return elements;
	}

	/**
	 * 插入数据
	 */
	public void insert(long value) {
		if (elements == 0) {
			arr[elements] = value;
		} else {
			if (value >= arr[elements - 1]) {
				arr[elements] = value;
			} else {
				for (int i = 0; i < elements; i++) {
					if (value <= arr[i]) {
						for (int j = elements - 1; j >= i; j--) {
							arr[j + 1] = arr[j];
						}
						arr[i] = value;
						break;
					}
				}
			}
		}
		elements++;
	}

	/**
	 * 遍历数据
	 */
	public void display() {
		System.out.print("[ ");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * 根据值找索引
	 */
	public int search(long value) {
		int i;
		for (i = 0; i < elements; i++) {
			if (value == arr[i]) {
				break;
			}
		}

		if (i == elements) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * 根据值找索引（二分法）
	 */
	public int binarySearch(long value) {
		int head = 0;
		int tail = elements - 1;
		int middle = 0;
		while (true) {
			middle = (int) ((head + tail) / 2);
			if (value == arr[middle]) {
				return middle;
			} else if (value < arr[middle]) {
				//左边
				tail = middle - 1;
			} else {
				//右边
				head = middle + 1;
			}
			if (tail - head < 2) {
				return -1;
			}
		}
	}

	/**
	 * 根据索引查找数据
	 */
	public long get(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	/**
	 * 删除元素
	 */
	public void delete(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			for (int i = index; i < elements - 1; i++) {
				arr[i] = arr[i + 1];
			}
			elements--;
		}
	}
}
