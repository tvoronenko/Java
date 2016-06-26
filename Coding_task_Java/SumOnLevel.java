package test;
/*
 * 
 * 
     6       6
    / \
   4   10    (14) ← maximum
  /|\   \
 1 2 3   5   11
 
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SumOnLevel {

	public static void main(String[] args) {
		// root level 0
				TreeNode A = TreeNode.createNode(6);
						// TreeNode 1
				TreeNode B = TreeNode.createNode(4);
				TreeNode C = TreeNode.createNode(10);
						// Level 2
				TreeNode D = TreeNode.createNode(1);
				TreeNode E = TreeNode.createNode(2);
				TreeNode F = TreeNode.createNode(3);
				TreeNode G = TreeNode.createNode(5);
				// connect Level 0 and 1
				A.nodes.add(B);
				A.nodes.add(C);
				// connect level 1 and level 2
				B.nodes.add(D);
				B.nodes.add(E);
				B.nodes.add(F);
				C.nodes.add(G);

				List<Integer> sum = new ArrayList<>();
				SumOnLevel prog = new SumOnLevel();
				//prog.levelSumInterative(A);
				sum = prog.levelSum(A);
				int max = prog.getMax(sum);
				System.out.println(max);

				

	}
	
//	public void levelSumInterative(TreeNode root){
//		if(root==null) return;
//		List<Integer> sum = new ArrayList<Integer>();
//		Stack<TreeNode> st = new Stack<TreeNode>();
//		st.push(root);
//		
//		while(!st.isEmpty()){
//			root = (TreeNode)st.pop();
//			System.out.println(root.value);
//			for(int i=root.nodes.size()-1;i>=0;i--){
//				if(root.nodes.get(i)!=null)
//					st.push(root.nodes.get(i));
//			}
//		}
//		
//	}
	public  List<Integer> levelSum(TreeNode tree) {

		List<Integer> sum = new ArrayList<Integer>();
		levelSum(tree, sum, 0);
		return sum;

	}
	
	public  int getMax(List<Integer> sum) {

		int max = sum.get(0);
		for (int i = 1; i < sum.size(); i++) {
			if (max < sum.get(i)) {
				max = sum.get(i);
			}
		}
		return max;
	}

	public  void levelSum(TreeNode tree, List<Integer> SumLevel, int level) {
		if (tree == null)
			return;


		if (SumLevel.size() == level) {
			SumLevel.add(0);
		}

		SumLevel.set(level, SumLevel.get(level) + tree.value);
				for (int i = 0; i < tree.nodes.size(); i++) {
					
					levelSum(tree.nodes.get(i), SumLevel, level + 1);
				}

	}

	
	static class TreeNode{
		int value;
		List<TreeNode> nodes;

		public TreeNode(int value) {
			this.value = value;
			this.nodes = new ArrayList<>();
		}
		
		public static TreeNode createNode(int number) {
			return new TreeNode(number);
		}

	}

}
