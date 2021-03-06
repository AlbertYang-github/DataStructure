package linearlist;

/**
 * sequential list
 */
public class SeqList {
	private long[] arr;
	// the valid length of sequential list
	private int elements;

	public SeqList() {
		// the default size is 50
		arr = new long[50];
	}

	public SeqList(int maxSize) {
		arr = new long[maxSize];
	}

	/**
	 * size
	 */
	public int size() {
		return elements;
	}

	/**
	 * insert data
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
	 * ergodic sequential list
	 */
	public void display() {
		System.out.print("[ ");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 *  find index according to value
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
	 * find index according to value��dichotomy��
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
				//the left
				tail = middle - 1;
			} else {
				//the right
				head = middle + 1;
			}
			if (tail - head < 2) {
				return -1;
			}
		}
	}

	/**
	 * find data by index
	 */
	public long get(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	/**
	 * delete data
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
