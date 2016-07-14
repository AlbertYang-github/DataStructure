package queue;

public class SeqQueueTest {

	public static void main(String[] args) {
		SeqQueue seqQueue = new SeqQueue(4);
		seqQueue.insert(1);
		seqQueue.insert(2);
		seqQueue.insert(3);
		seqQueue.insert(4);
		
		System.out.println(seqQueue.isEmpty());
		System.out.println(seqQueue.isFull());
		System.out.println(seqQueue.peek());
		
		while (!seqQueue.isEmpty()) {
			System.out.print(seqQueue.remove() + " ");
		}
		
		System.out.println();
		
		seqQueue.insert(1);
		seqQueue.insert(2);
		seqQueue.insert(3);
		seqQueue.insert(4);
		
		while (!seqQueue.isEmpty()) {
			System.out.print(seqQueue.remove() + " ");
		}
	}
}
