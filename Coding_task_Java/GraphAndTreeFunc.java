import java.util.LinkedList;

public class GraphAndTreeFunc {

	public static void main(String[] args) {
		Graph g = new Graph();

	}

	boolean search(Graph g, Graph.Node start, Graph.Node end) {
		if (start == end)
			return true;

		LinkedList<Graph.Node> q = new LinkedList<Graph.Node>();
		for (Graph.Node n : g.getNodes()) {
			n.state = State.Unvisited;

		}
		
		start.state = State.Visiting;
		q.add(start);
		Graph.Node n ;
		
		while(!q.isEmpty()){
			n = q.removeFirst();
			if(n!=null){
				for(Graph.Node v:n.getAdjacent()){
					if(v.state == State.Unvisited){
						if(v==end){
							return true;
						}else{
							v.state = State.Visiting;
							q.add(v);
						}
					}
				}
				n.state = State.Visited;
			}
		}
		return false;

	}
}