package stack;

/**
 * 顺序栈的实现 (基于数组)
 */
public class SeqStack {
	private long[] arr;
	private int top;
	
	/**
	 * 默认构造方法
	 */
	public SeqStack() {
		arr = new long[10];
		//表示栈中还没有数据
		top = -1;
	}
	
	/**
	 * 带参构造方法
	 * @param maxsize
	 */
	public SeqStack(int maxsize) {
		arr = new long[maxsize];
		top = -1;
	}
	
	/**
	 * 压栈 (添加数据)
	 * @param value
	 */
	public void push(long value) {
		arr[++top] = value;
	}
	
	/**
	 * 弹栈 (删除数据)
	 * @return 被删除的数据
	 */
	public long pop() {
		return arr[top--];
	}
	
	/**
	 * 查看栈顶数据
	 * @return
	 */
	public long peek() {
		return arr[top];
	}
	
	/**
	 * 判断是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return top == -1;
	}
	
	/**
	 * 判断是否为空
	 * @return
	 */
	public boolean isFull() {
		return top == arr.length - 1;
	}
}
