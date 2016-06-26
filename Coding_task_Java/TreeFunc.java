import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeFunc {

	public static void main(String[] args) {
		int array[] = { 0, 2, 3, 4, 5, 6, 7, 8, 12, 20, 35, 40 };
		Tree bi = new Tree();
		Node result = createMinimalBST(array);
		bi.root = result;
		bi.displayTree();
		List<LinkedList<Node>> listbyLevel = null;
		listbyLevel = createLinkedList(bi.root);
		for (int i = 0; i < listbyLevel.size(); i++) {
			System.out.println("level " + i);
			for (Node n : listbyLevel.get(i)) {
				System.out.println(n.item);
			}

		}

	}

	static Node createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}

	static Node createMinimalBST(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		// preorder
		Node n = new Node(arr[mid]);
		n.leftChild = createMinimalBST(arr, start, mid - 1);
		n.rightChild = createMinimalBST(arr, mid + 1, end);
		return n;
	}

	static void createLinkedList(Node root, List<LinkedList<Node>> listbyLevel, int level) {
		if (root == null)
			return;
		LinkedList<Node> elements = null;
		if (listbyLevel.size() == level) {
			elements = new LinkedList<Node>();
			listbyLevel.add(elements);
		} else {
			elements = listbyLevel.get(level);
		}
//preorder
		elements.add(root);
		createLinkedList(root.leftChild, listbyLevel, level + 1);
		createLinkedList(root.rightChild, listbyLevel, level + 1);
	}

	static List<LinkedList<Node>> createLinkedList(Node root) {
		List<LinkedList<Node>> listbyLevel = new ArrayList<LinkedList<Node>>();
		createLinkedList(root, listbyLevel, 0);
		return listbyLevel;

	}
}
