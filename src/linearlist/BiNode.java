package linearlist;

public class BiNode {
	// 指向前一个结点的指针域
	public BiNode previous;
	// 指向后一个结点的指针域
	public BiNode rear;
	// 数据域
	public int data;

	/**
	 * 无参构造方法
	 */
	public BiNode() {
	}
	
	/**
	 * 构造方法
	 * 
	 * @param previous
	 * @param rear
	 * @param data
	 */
	public BiNode(BiNode previous, BiNode rear, int data) {
		this.previous = previous;
		this.rear = rear;
		this.data = data;
	}
	
	/**
	 * 显示前一个结点
	 * @return 数据域
	 */
	public int show() {
		return this.data;
	}
}
