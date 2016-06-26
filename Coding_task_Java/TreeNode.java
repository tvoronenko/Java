import java.util.LinkedList;
import java.util.Queue;

class Node
{
	public int item;
	public Node leftChild;
	public Node rightChild;
	public Node(int i) {
		item=i;
	}
	public void displayNode()
	{
		System.out.print("[");
		System.out.print(item);
		System.out.print("]");
	}
}
class StackNode
{
	public Node item;
	public StackNode next;
	public StackNode(Node val)
	{
		item = val;
	}

}
class LinkedListStack
{
	private StackNode first;
	public LinkedListStack()
	{
		first = null;
	}
	public boolean isEmpty()
	{
		return (first==null);
	}
	public void insert(Node key)//inserts at beginning of list
	{
		StackNode newLLNode = new StackNode(key);
		newLLNode.next = first;
		first = newLLNode;
	}
	public Node delete()//deletes at beginning of list
	{
		StackNode temp = first;
		first = first.next;
		return temp.item;
	}
}
class MyStack
{
	private LinkedListStack listObj;
	public MyStack()
	{
		listObj = new LinkedListStack();
	}
	public void push(Node num)
	{
		listObj.insert(num);
	}
	public Node pop()
	{
		return listObj.delete();
	}
	public boolean isEmpty()
	{
		return listObj.isEmpty();
	}
}

class Tree
{
	public Node root;
	public Tree()
	{ root = null; }
	public Node returnRoot()
	{
		return root;
	}
	public void insert(int id)
	{
		Node newNode = new Node(id);
		if(root==null)
			root = newNode;
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(id < current.item)
				{
					current = current.leftChild;
					if(current == null)
					{
						parent.leftChild = newNode;
						return;
					}
				} 
				else
				{
					current = current.rightChild;
					if(current == null) 
					{
						parent.rightChild = newNode;
						return;
					}
				} 
			} 
		} 
	} 
	public void preOrder(Node Root)
	{
		if(Root != null)
		{	
			System.out.print(Root.item + " ");
			preOrder(Root.leftChild);
			preOrder(Root.rightChild);
		}
	}
	public void inOrder(Node Root)
	{
		if(Root != null)
		{
			inOrder(Root.leftChild);
			System.out.print(Root.item + " ");
			inOrder(Root.rightChild);
		}
	}
	public void postOrder(Node Root)
	{
		if(Root != null)
		{
			postOrder(Root.leftChild);
			postOrder(Root.rightChild);
			System.out.print(Root.item + " ");
		}
	}
	
	public void byLevel(Node root){
		 Queue<Node> level	= new LinkedList<>();
		 level.add(root);
		 
		 while(!level.isEmpty()){
			 Node node = level.poll();
			 System.out.print(node.item + " ");
			 if(node.leftChild!= null)
			 level.add(node.leftChild);
			 if(node.rightChild!= null)
			 level.add(node.rightChild);
		 }
	}
	
	public void displayTree()
	{
		MyStack globalStack = new MyStack();
		globalStack.push(root);	
		int emptyLeaf = 32;
		boolean isRowEmpty = false;
		System.out.println("****......................................................****");
		while(isRowEmpty==false)
		{

			MyStack localStack = new MyStack();
			isRowEmpty = true;
			for(int j=0; j<emptyLeaf; j++)
				System.out.print(' ');
			while(globalStack.isEmpty()==false)
			{
				Node temp = globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.item);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null ||temp.rightChild != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<emptyLeaf*2-2; j++)
					System.out.print(' ');
			}
			System.out.println();
			emptyLeaf /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}
	System.out.println("****......................................................****");
	} 
}