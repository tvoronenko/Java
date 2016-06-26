public class MyLinkedList {
	int size = 0;
	LinkedListNode first = null;

	public static class LinkedListNode {
		Integer data = null;
		LinkedListNode next = null;
		
		public String toString() {
			LinkedListNode current = this;
			StringBuilder output = new StringBuilder();
			while (current != null) {
				output.append(current.data) ;
				output.append(" ->") ;
				current = current.next;
			}

			return output.toString();

		}
	}

	public String toString() {
		LinkedListNode current = first;
		StringBuilder output = new StringBuilder();
		while (current != null) {
			output.append(current.data) ;
			output.append(" ->") ;
			current = current.next;
		}

		return output.toString();

	}

	public void add(int value) {
		LinkedListNode oldFirst = first;
		first = new LinkedListNode();
		first.data = value;
		first.next = oldFirst;
		size++;
	}

}
