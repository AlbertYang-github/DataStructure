package linearlist;

public class BidirectionLinkedList {
	// 头结点
	private BiNode head;
	// p指向尾结点
	public BiNode p;
	// 链表的长度
	private int size = 0;

	/*
	 * 构造一个头结点（空结点）
	 */
	public BidirectionLinkedList() {
		head = new BiNode();
		p = new BiNode();
	}

	/**
	 * 头插入
	 * 
	 * @param data
	 */
	public void insertHead(int data) {
		// 构造结点
		BiNode node = new BiNode();
		node.data = data;

		// 头插入
		node.rear = head.rear;
		head.rear = node;
		head.rear.previous = node;
		node.previous = head;

		// 长度+1
		size++;

		// p指向尾结点
		if (size == 1) {
			p.rear = node;
		}
	}

	/**
	 * 尾插入
	 * 
	 * @param data
	 */
	public void insertRear(int data) {
		// 构造结点
		BiNode node = new BiNode();
		node.data = data;

		// 尾插入
		node.previous = p.rear;
		p.rear.rear = node;

		// 长度+1
		size++;

		// p指向尾结点
		p.rear = node;
	}

	/**
	 * 中间插入
	 * 
	 * @param loc
	 * @param data
	 */
	public void insert(int loc, int data) {
		// 检查范围
		if (loc > 0 && loc < size) {
			// 构造结点
			BiNode node = new BiNode();
			node.data = data;

			// 构造临时结点
			BiNode temp = new BiNode();
			temp.rear = head.rear;

			// 中间插入
			for (int i = 1; i <= size; i++) {
				if (i == (loc - 1)) {
					node.rear = temp.rear.rear;
					node.previous = temp.rear;
					temp.rear.rear.previous = node;
					temp.rear.rear = node;
					break;
				}
				temp.rear = temp.rear.rear;
			}

			// 长度+1
			size++;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * 删除结点
	 * 
	 * @param loc
	 */
	public void delete(int loc) {
		// loc范围检查
		if (loc > 0 && loc <= size) {
			
			if (loc == 1) {
				// 头删除
			}

			if (loc == size) {
				// 尾删除
			}
			
			if (loc > 1 && loc < size) {
				// 中间删除
			}

			// 长度减一
			size--;
			
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	/**
	 * 遍历链表
	 */
	public void show() {
		BiNode temp = new BiNode();
		temp.rear = head.rear;

		System.out.print("[ ");
		for (int i = 1; i <= size; i++) {
			System.out.print(temp.rear.data + " ");
			temp.rear = temp.rear.rear;
		}
		System.out.println("]");
	}
}
