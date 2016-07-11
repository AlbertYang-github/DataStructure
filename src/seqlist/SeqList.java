package seqlist;

/**
 * ˳���
 */
public class SeqList {
	private long[] arr;
	// ˳������Ч����
	private int elements;

	public SeqList() {
		// Ĭ�ϴ�СΪ50
		arr = new long[50];
	}

	public SeqList(int maxSize) {
		arr = new long[maxSize];
	}

	/**
	 * ��ʾ���ݵĳ���
	 */
	public int size() {
		return elements;
	}

	/**
	 * ��������
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
	 * ��������
	 */
	public void display() {
		System.out.print("[ ");
		for (int i = 0; i < elements; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}

	/**
	 * ����ֵ������
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
	 * ����ֵ�����������ַ���
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
				//���
				tail = middle - 1;
			} else {
				//�ұ�
				head = middle + 1;
			}
			if (tail - head < 2) {
				return -1;
			}
		}
	}

	/**
	 * ����������������
	 */
	public long get(int index) {
		if (index >= elements || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return arr[index];
		}
	}

	/**
	 * ɾ��Ԫ��
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
