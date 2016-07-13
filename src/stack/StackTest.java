package stack;

public class StackTest {

	public static void main(String[] args) {
		SeqStack seqStack = new SeqStack();
		seqStack.push(1);
		seqStack.push(2);
		seqStack.push(3);
		System.out.println(seqStack.peek() + "");
		seqStack.pop();
		System.out.println(seqStack.peek());
	}
}
