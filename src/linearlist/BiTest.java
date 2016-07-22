package linearlist;

public class BiTest {
	public static void main(String[] args) {
		BidirectionLinkedList list = new BidirectionLinkedList();

		// 头插入
		list.insertHead(5);
		list.insertHead(4);
		list.insertHead(3);
		list.insertHead(2);
		list.insertHead(1);

		// 尾插入
		list.insertRear(6);
		list.insertRear(7);
		list.insertRear(8);
		
		//中间插入
		list.insert(3, -1);
		list.insert(5, -1);

		// 遍历
		list.show();
		System.out.println(list.p.rear.data);
	}
}
