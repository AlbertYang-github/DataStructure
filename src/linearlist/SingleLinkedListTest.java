package linearlist;

public class SingleLinkedListTest {

	public static void main(String[] args) {
		
		//首先构造一个空单链表
		SingleLinkedList list = new SingleLinkedList();
		
		//头插入
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		//遍历
		list.display();
		
//		//头删除
//		list.deleteFirst();
//		list.deleteFirst();
//		
//		//遍历
//		list.display();
		
		//查询
		Node node = list.find(4);
		System.out.println(node.data + "");
	}
}
