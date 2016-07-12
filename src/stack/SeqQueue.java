package stack;

/**
 * 顺序队列的实现 (基于数组)
 */
public class SeqQueue {
	// 底层使用数组
	private long[] arr;
	// 有效数据大小
	private int elements;
	// 队头
	private int front;
	// 队尾
	private int end;

	/**
	 * 默认构造方法
	 */
	public SeqQueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 带参构造方法
	 * 
	 * @param maxsize
	 */
	public SeqQueue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * 入队 (尾插入)
	 * 
	 * @param value
	 */
	public void insert(long value) {
		arr[++end] = value;
		elements++;
	}
	
	/**
	 * 出队 (头删除)
	 * @return
	 */
	public long remove() {
		elements--;
		return arr[front--];
	}
	
	/**
	 * 查看数据
	 * @return
	 */
	public long peek() {
		return arr[front];
	}
	
	/**
	 * 判断是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return elements == 0;
	}
	
	/**
	 * 判断是否已满
	 * @return
	 */
	public boolean isFull() {
		return elements == arr.length;
	}
}
