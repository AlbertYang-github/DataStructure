package linearlist;

/**
 * 双端链表 (头结点中既包含对第一个结点的引用又包含对最后一个结点的引用)
 */
public class HeadEndLinkedList {
	//头结点
	private HeadEndNode head;
	
	/**
	 * 创建一个空单链表 (只有头结点)
	 * 头结点中包含两个指针域
	 */
	public HeadEndLinkedList() {
		head = new HeadEndNode(null, null);
	}
	
	/**
	 * 头插入
	 * @param data
	 */
	public void insertFirst(long data) {
		//创建一个结点
		Node node = new Node(data);
		if (head.next == null) {
			//插入之前为空链表 (头结点的next和end都指向同一个结点)
			head.next = node;
			head.end = node;
		} else {
			//插入之前为非空链表 (end指针域不变)
			node.next = head.next;
			head.next = node;
		}
	}
	
	/**
	 * 头删除
	 */
	public Node deleteFirst() {
		Node p = head.next;;
		if (head.next.next == null) {
			//链表中只存在一个结点
			head.next = null;
			head.end = null;
		} else {
			//链表中存在至少两个结点
			head.next = head.next.next;
		}
		return p;
	}
	
	/**
	 * 遍历结点
	 */
	public void display() {
		//复制一个头结点 (用于跟踪结点)
		Node p = new Node();
		p.next = head.next;
		while (p.next != null) {
			System.out.print(p.next.data + " ");
			p.next = p.next.next;
		}
		System.out.println();
	}
	
	/**
	 * 查询
	 * @param data
	 * @return
	 */
	public Node find(long data) {
		//复制一个头结点 (用于跟踪结点)
		Node p = new Node();
		p.next = head.next;
		while (p.next != null) {
			if (p.next.data == data) {
				return p.next;
			}
			p.next = p.next.next;
		}
		return null;
	}
}
