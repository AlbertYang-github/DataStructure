package seqlist;

public class SeqListTest {
	public static void main(String[] args) {
		SeqList seqList = new SeqList();
		
		//����Ԫ��
		seqList.insert(1);
		seqList.insert(3);
		seqList.insert(5);
		seqList.insert(7);
		seqList.insert(4);
		seqList.insert(0);
		seqList.display();
		
		//���ַ�����
		System.out.println("����" + seqList.binarySearch(3));
		
//		//����Ԫ��������
//		System.out.println(seqList.search(3));
//		
//		//����������ѯ
//		System.out.println(seqList.get(1));
//		
//		//��������ɾ��Ԫ��
//		seqList.delete(2);
//		seqList.display();
//		System.out.println(seqList.size());
	}
}
