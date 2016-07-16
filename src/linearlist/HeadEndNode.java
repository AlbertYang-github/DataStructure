package linearlist;

/**
 * 双端链表的头结点类
 */
public class HeadEndNode {
	//包含两个指针域
	public Node next;
	public Node end;
	
	public HeadEndNode(Node next, Node end) {
		this.next = next;
		this.end = end;
	}
}
