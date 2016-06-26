
public class FindNToLast {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(10);
		list.add(6);
		System.out.println(list.toString());
		int K = 4;
		System.out.println(findNToLast(list, K).data);

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

}
