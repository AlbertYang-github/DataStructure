package linearlist;

/**
 * 结点类
 */
public class Node {
	//数据域
	public long data;
	//指针域
	public Node next;
	
	public Node() {
	}

	public Node(long data) {
		this.data = data;
	}
	
	/**
	 * 显示方法
	 */
	public void display() {
		System.out.println(data + " ");
	}
}
