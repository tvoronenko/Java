import java.util.HashSet;
import java.util.Set;

public class RemoveDuplLinkedList {

	public static void main(String[] args) {
		MyLinkedList listWithDupl = new MyLinkedList();
		listWithDupl.add(3);
		listWithDupl.add(5);
		listWithDupl.add(1);
		listWithDupl.add(2);
		listWithDupl.add(3);
		listWithDupl.add(2);
		listWithDupl.add(10);
		listWithDupl.add(6);
		System.out.println(listWithDupl.toString());
		removeDupl1(listWithDupl);
		System.out.println(listWithDupl.toString());
		int K = 4;
		System.out.println(findNToLast(listWithDupl, K).data);
		deleteMiddleNode(listWithDupl.first);
		System.out.println(listWithDupl.toString());
	//	System.out.println(reverseAndClone(listWithDupl).toString());
		reverse(listWithDupl);
		System.out.println(listWithDupl.toString());
		reverse(listWithDupl);
		MyLinkedList list1 = new MyLinkedList();
		list1.add(6);
		list1.add(1);
		list1.add(7);
		System.out.println(list1.toString());
		MyLinkedList list2 = new MyLinkedList();
		list2.add(2);
		list2.add(9);
		list2.add(5);
		System.out.println(list2.toString());
		System.out.println(summList(list1.first, list2.first, 0).toString());
		
		
		
	}
	
	public static MyLinkedList.LinkedListNode  summList(MyLinkedList.LinkedListNode firstNode, MyLinkedList.LinkedListNode secondNode, int carry){
		if(firstNode ==null && secondNode == null && carry==0)
			return null;
		
		 MyLinkedList.LinkedListNode  result= new  MyLinkedList.LinkedListNode ();
		 int value = carry;
		 if(firstNode!=null)
			 value+=firstNode.data;
		 
		 if(secondNode!=null)
			 value+=secondNode.data;
		 
		 result.data = value % 10;
		 
		 if(firstNode !=null || secondNode != null ){
			 MyLinkedList.LinkedListNode more =  summList(firstNode == null? null:firstNode.next, 
					 secondNode == null? null:secondNode.next,
							 value>=10?1:0);
			 result.next = more;
		 }
				 
		
		return result;
	}

	public static void removeDupl(MyLinkedList listWithDupl) {
		MyLinkedList.LinkedListNode current = listWithDupl.first;
		Set<Integer> setDuplicates = new HashSet<Integer>();
		MyLinkedList.LinkedListNode prev = null;

		while (current != null) {
			if (setDuplicates.contains(current.data)) {
				prev.next = current.next;
			} else {
				setDuplicates.add(current.data);
				prev = current;
			}
			current = current.next;
		}
	}

	public static void removeDupl1(MyLinkedList listWithDupl) {
		MyLinkedList.LinkedListNode current = listWithDupl.first;
		while (current != null) {
			MyLinkedList.LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;

				} else {
					runner = runner.next;
				}

			}

			current = current.next;
		}
	}
	
	public static MyLinkedList.LinkedListNode findNToLast(MyLinkedList list, int K){
		MyLinkedList.LinkedListNode current = list.first;
		MyLinkedList.LinkedListNode runner = current;
		for (int i=0; i<K; i++){
			if (runner!=null){
				runner = runner.next;
			}else
				return null;// error
		}
		while(runner!=null){
			current = current.next;
			runner = runner.next;
		}
		
		return current;
	};

	public static void deleteMiddleNode(MyLinkedList.LinkedListNode node){
		if(node==null && node.next==null)
			return ;//error
		MyLinkedList.LinkedListNode next = node.next;
		node.data=next.data;
		node.next = next.next;
		
	}
	
	public static MyLinkedList.LinkedListNode reverse(MyLinkedList list){
		MyLinkedList.LinkedListNode nextNode = null;
		MyLinkedList.LinkedListNode current = list.first;
		MyLinkedList.LinkedListNode prev = null;
		while(current!=null){
			nextNode =  current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		list.first = prev;
		return prev;
	}
	
	public static MyLinkedList.LinkedListNode reverseAndClone(MyLinkedList list){
		MyLinkedList.LinkedListNode head = null;
		MyLinkedList.LinkedListNode current =  list.first;
		while(current!=null){
			MyLinkedList.LinkedListNode n = new MyLinkedList.LinkedListNode();
			n.data = current.data;
			n.next = head;
			head = n;
			current = current.next;
		}
		return head;
	
	}
	
}
