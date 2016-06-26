import java.util.LinkedList;
import java.util.Queue;

import javax.xml.namespace.QName;

/*
 * 
 * 
     6       6
    / \
   4   10    (14) ← maximum
  /|   / \
 1 2   3  5   11
 
 */

public class TestMyTree {

	public static void main(String[] args) {
		Tree tree = new Tree();
		// root level 0
		TreeNode A = TreeNode.createNode(6);
		// connect Level 0 and 1
		A.left = TreeNode.createNode(4);
		A.right = TreeNode.createNode(10);
		// connect level 1 and level 2
		A.left.left = TreeNode.createNode(1);
		A.left.right = TreeNode.createNode(2);
		A.right.left = TreeNode.createNode(3);
		A.right.right = TreeNode.createNode(5);
		System.out.println("InOrder");
		TreeNode.printInOrder(A);
		System.out.println("InOrderIter");
		TreeNode.printInOrderIter(A);
		System.out.println("PostOrder");
		TreeNode.printPostOrder(A);
		System.out.println("PostOrderIter");
		TreeNode.printPostOrderIter(A);
		System.out.println("PreOrder");
		TreeNode.printPreOrder(A);
		System.out.println("PreOrderIter");
		TreeNode.printPreOrderIter(A);
		System.out.println("LevelOrder");
		TreeNode.levelOrder(A);

	}

}

class TreeNode {

	int data;
	TreeNode left = null, right = null;

	TreeNode(int data) {
		this.data = data;
	}

	public static TreeNode createNode(int number) {
		return new TreeNode(number);
	}

	static void printInOrder(TreeNode root) {
		if (root == null)
			return;

		printInOrder(root.left);
		System.out.println(root.data);
		printInOrder(root.right);
	}

	static void printInOrderIter(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> st = new Stack<TreeNode>();
		while (!st.isEmpty() || root != null) {
			if (root != null) {
				st.push(root);
				root = root.left;
			} else {
				root = st.pop();
				System.out.println(root.data);
				root = root.right;
			}

		}
	}

	static void levelOrder(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.poll();
			System.out.println(root.data);
			if (root.left != null) {
				q.add(root.left);
			}
			if (root.right != null) {
				q.add(root.right);
			}
		}

	}

	static void printPreOrder(TreeNode root) {
		if (root == null)
			return;

		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	static void printPreOrderIter(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.push(root);

		while (!st.isEmpty()) {
			TreeNode n = (TreeNode) st.pop();
			System.out.println(n.data);

			if (n.right != null)
				st.push(n.right);
			if (n.left != null)
				st.push(n.left);
		}
	}

	static void printPostOrder(TreeNode root) {
		if (root == null)
			return;

		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.println(root.data);

	}

	static void printPostOrderIter(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode lastNodeVisited = null;

		while (!st.isEmpty() || root != null) {
			if (root != null) {
				st.push(root);
				root = root.left;
			} else {
				TreeNode peekNode = st.peek();
				// if right child exists and traversing node
				// from left child, then move right
				// add right
				if (peekNode.right != null && lastNodeVisited != peekNode.right) {
					root = peekNode.right;
				} else {
					// print
					System.out.println(peekNode.data);
					lastNodeVisited = st.pop();
				}
			}

		}
	}

}
//
// class TreeNode{
// int data;
// TreeNode left = null;
// TreeNode right = null;
//
// TreeNode(int data){
// this.data=data;
// }
// }
