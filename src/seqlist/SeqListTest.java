package seqlist;

public class SeqListTest {
	public static void main(String[] args) {
		SeqList seqList = new SeqList();
		
		//插入元素
		seqList.insert(1);
		seqList.insert(3);
		seqList.insert(5);
		seqList.insert(7);
		seqList.insert(4);
		seqList.insert(0);
		seqList.display();
		
		//二分法查找
		System.out.println("索引" + seqList.binarySearch(3));
		
//		//根据元素找索引
//		System.out.println(seqList.search(3));
//		
//		//根据索引查询
//		System.out.println(seqList.get(1));
//		
//		//根据索引删除元素
//		seqList.delete(2);
//		seqList.display();
//		System.out.println(seqList.size());
	}
}
