enum State { Unvisited, Visited, Visiting;}	
class Graph{
		public Node[] nodes;
	
	
	public Node[] getNodes(){
		return nodes;
		
	}
	class Node{
		State state;
		String name;
		Node[] child;
		
		public Node[] getAdjacent() {
			// TODO Auto-generated method stub
			return child;
		}
		
		
		}
	}