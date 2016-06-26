import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] arg){
		List passengerList = new LinkedList();
		passengerList.add("Alex");
		passengerList.add("Mary");
		passengerList.add("Sim");
		
		ListIterator iterator = passengerList.listIterator();
		System.out.println(iterator.next());
		passengerList.add("VIP");
		iterator.previous();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());
	}
}
