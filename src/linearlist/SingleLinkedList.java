package linearlist;

/**
 * 单链表的实现
 */
public class SingleLinkedList {
	//头结点
	private Node head;
	
	/**
	 * 创建一个空单链表 (只有头结点)
	 */
	public SingleLinkedList() {
		head = new Node();
	}
	
	/**
	 * 头插入
	 * @param data
	 */
	public void insertFirst(long data) {
		Node node = new Node(data);
		node.next = head.next;
		head.next = node;
	}
	
	/**
	 * 头删除
	 */
	public Node deleteFirst() {
		head.next = head.next.next;
		return head.next;
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

























